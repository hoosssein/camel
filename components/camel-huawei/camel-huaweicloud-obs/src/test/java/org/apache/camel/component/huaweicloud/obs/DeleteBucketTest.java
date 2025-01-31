/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.huaweicloud.obs;

import java.util.HashMap;
import java.util.Map;

import com.obs.services.ObsClient;
import com.obs.services.model.HeaderResponse;
import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.huaweicloud.common.models.ServiceKeys;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteBucketTest extends CamelTestSupport {
    private static final Logger LOG = LoggerFactory.getLogger(DeleteBucketTest.class.getName());

    TestConfiguration testConfiguration = new TestConfiguration();

    @BindToRegistry("obsClient")
    ObsClient mockClient = Mockito.mock(ObsClient.class);

    @BindToRegistry("serviceKeys")
    ServiceKeys serviceKeys = new ServiceKeys(
            testConfiguration.getProperty("authenticationKey"),
            testConfiguration.getProperty("secretKey"));

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:delete_bucket")
                        .setProperty("CamelHwCloudObsBucketName", constant(testConfiguration.getProperty("bucketName")))
                        .to("hwcloud-obs:deleteBucket?" +
                            "serviceKeys=#serviceKeys" +
                            "&region=" + testConfiguration.getProperty("region") +
                            "&ignoreSslVerification=true" +
                            "&obsClient=#obsClient")
                        .log("Delete bucket successful")
                        .to("mock:delete_bucket_result");
            }
        };
    }

    @Test
    public void testDeleteBucket() throws Exception {
        HeaderResponse response = new HeaderResponse();
        Map<String, Object> headers = new HashMap<>();
        headers.put("connection", "Keep-Alive");
        headers.put("date", "Day-of-week Month Day Time Year");
        headers.put("id", "123ABC");
        response.setResponseHeaders(headers);
        Mockito.when(mockClient.deleteBucket(Mockito.anyString())).thenReturn(response);

        MockEndpoint mock = getMockEndpoint("mock:delete_bucket_result");
        mock.expectedMinimumMessageCount(1);
        template.sendBody("direct:delete_bucket", "sample_body");
        Exchange responseExchange = mock.getExchanges().get(0);

        mock.assertIsSatisfied();

        assertEquals("{\"date\":\"Day-of-week Month Day Time Year\",\"connection\":\"Keep-Alive\",\"id\":\"123ABC\"}",
                responseExchange.getIn().getBody(String.class));
    }
}
