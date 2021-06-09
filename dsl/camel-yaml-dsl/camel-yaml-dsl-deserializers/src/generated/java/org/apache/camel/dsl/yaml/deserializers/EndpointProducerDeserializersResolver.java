// Generated by camel-yaml-dsl-maven-plugin - do NOT edit this file!
package org.apache.camel.dsl.yaml.deserializers;

import java.lang.Override;
import java.lang.String;
import org.apache.camel.dsl.yaml.common.YamlDeserializerResolver;
import org.snakeyaml.engine.v2.api.ConstructNode;
import org.snakeyaml.engine.v2.nodes.Node;

public final class EndpointProducerDeserializersResolver implements YamlDeserializerResolver {
    @Override
    public int getOrder() {
        return YamlDeserializerResolver.ORDER_LOWEST;
    }

    public static String resolveEndpointUri(String id, Node node) {
        switch(id) {
            case "activemq":
            case "ahc":
            case "ahc-ws":
            case "ahc-wss":
            case "amqp":
            case "arangodb":
            case "as2":
            case "asterisk":
            case "atlasmap":
            case "atmos":
            case "atmosphere-websocket":
            case "atomix-map":
            case "atomix-messaging":
            case "atomix-multimap":
            case "atomix-queue":
            case "atomix-set":
            case "atomix-value":
            case "avro":
            case "aws-secrets-manager":
            case "aws2-athena":
            case "aws2-cw":
            case "aws2-ddb":
            case "aws2-ec2":
            case "aws2-ecs":
            case "aws2-eks":
            case "aws2-eventbridge":
            case "aws2-iam":
            case "aws2-kinesis":
            case "aws2-kinesis-firehose":
            case "aws2-kms":
            case "aws2-lambda":
            case "aws2-mq":
            case "aws2-msk":
            case "aws2-s3":
            case "aws2-ses":
            case "aws2-sns":
            case "aws2-sqs":
            case "aws2-sts":
            case "aws2-translate":
            case "azure-cosmosdb":
            case "azure-eventhubs":
            case "azure-storage-blob":
            case "azure-storage-datalake":
            case "azure-storage-queue":
            case "bean":
            case "bean-validator":
            case "beanstalk":
            case "bonita":
            case "box":
            case "braintree":
            case "browse":
            case "caffeine-cache":
            case "caffeine-loadcache":
            case "chatscript":
            case "chunk":
            case "class":
            case "cm-sms":
            case "cmis":
            case "coap":
            case "coap+tcp":
            case "coaps":
            case "coaps+tcp":
            case "cometd":
            case "cometds":
            case "consul":
            case "controlbus":
            case "corda":
            case "couchbase":
            case "couchdb":
            case "cql":
            case "crypto":
            case "cxf":
            case "cxfrs":
            case "dataformat":
            case "dataset":
            case "dataset-test":
            case "digitalocean":
            case "direct":
            case "direct-vm":
            case "disruptor":
            case "disruptor-vm":
            case "djl":
            case "dns":
            case "docker":
            case "dozer":
            case "drill":
            case "dropbox":
            case "ehcache":
            case "elasticsearch-rest":
            case "elsql":
            case "etcd-keys":
            case "etcd-stats":
            case "exec":
            case "facebook":
            case "fhir":
            case "file":
            case "flatpack":
            case "flink":
            case "fop":
            case "freemarker":
            case "ftp":
            case "ftps":
            case "ganglia":
            case "geocoder":
            case "git":
            case "github":
            case "google-bigquery":
            case "google-bigquery-sql":
            case "google-calendar":
            case "google-drive":
            case "google-functions":
            case "google-mail":
            case "google-pubsub":
            case "google-sheets":
            case "google-storage":
            case "gora":
            case "grape":
            case "graphql":
            case "grpc":
            case "guava-eventbus":
            case "hazelcast-atomicvalue":
            case "hazelcast-list":
            case "hazelcast-map":
            case "hazelcast-multimap":
            case "hazelcast-queue":
            case "hazelcast-replicatedmap":
            case "hazelcast-ringbuffer":
            case "hazelcast-seda":
            case "hazelcast-set":
            case "hazelcast-topic":
            case "hbase":
            case "hdfs":
            case "http":
            case "https":
            case "hwcloud-functiongraph":
            case "hwcloud-smn":
            case "iec60870-client":
            case "iec60870-server":
            case "ignite-cache":
            case "ignite-compute":
            case "ignite-idgen":
            case "ignite-messaging":
            case "ignite-queue":
            case "ignite-set":
            case "imap":
            case "imaps":
            case "infinispan":
            case "infinispan-embedded":
            case "influxdb":
            case "iota":
            case "ipfs":
            case "irc":
            case "ironmq":
            case "jbpm":
            case "jcache":
            case "jclouds":
            case "jcr":
            case "jdbc":
            case "jgroups":
            case "jgroups-raft":
            case "jing":
            case "jira":
            case "jms":
            case "jolt":
            case "jooq":
            case "jpa":
            case "jslt":
            case "json-validator":
            case "jsonata":
            case "jt400":
            case "kafka":
            case "kamelet":
            case "kamelet-reify":
            case "kubernetes-config-maps":
            case "kubernetes-custom-resources":
            case "kubernetes-deployments":
            case "kubernetes-hpa":
            case "kubernetes-job":
            case "kubernetes-namespaces":
            case "kubernetes-nodes":
            case "kubernetes-persistent-volumes":
            case "kubernetes-persistent-volumes-claims":
            case "kubernetes-pods":
            case "kubernetes-replication-controllers":
            case "kubernetes-resources-quota":
            case "kubernetes-secrets":
            case "kubernetes-service-accounts":
            case "kubernetes-services":
            case "kudu":
            case "language":
            case "ldap":
            case "ldif":
            case "log":
            case "lpr":
            case "lucene":
            case "metrics":
            case "micrometer":
            case "microprofile-metrics":
            case "milo-client":
            case "milo-server":
            case "mina":
            case "minio":
            case "mllp":
            case "mock":
            case "mongodb":
            case "mongodb-gridfs":
            case "msv":
            case "mustache":
            case "mvel":
            case "mybatis":
            case "mybatis-bean":
            case "nagios":
            case "nats":
            case "netty":
            case "netty-http":
            case "nitrite":
            case "nsq":
            case "oaipmh":
            case "olingo2":
            case "olingo4":
            case "openshift-build-configs":
            case "openshift-builds":
            case "openstack-cinder":
            case "openstack-glance":
            case "openstack-keystone":
            case "openstack-neutron":
            case "openstack-nova":
            case "openstack-swift":
            case "optaplanner":
            case "paho":
            case "paho-mqtt5":
            case "pdf":
            case "pgevent":
            case "pop3":
            case "pop3s":
            case "pubnub":
            case "pulsar":
            case "quickfix":
            case "rabbitmq":
            case "reactive-streams":
            case "ref":
            case "rest":
            case "rest-openapi":
            case "rest-swagger":
            case "resteasy":
            case "robotframework":
            case "saga":
            case "salesforce":
            case "sap-netweaver":
            case "schematron":
            case "scp":
            case "seda":
            case "servicenow":
            case "sftp":
            case "sip":
            case "sips":
            case "sjms":
            case "sjms2":
            case "slack":
            case "smpp":
            case "smpps":
            case "smtp":
            case "smtps":
            case "snmp":
            case "solr":
            case "solrCloud":
            case "solrs":
            case "soroush":
            case "spark":
            case "splunk":
            case "splunk-hec":
            case "spring-batch":
            case "spring-event":
            case "spring-integration":
            case "spring-jdbc":
            case "spring-ldap":
            case "spring-rabbitmq":
            case "spring-redis":
            case "spring-ws":
            case "sql":
            case "sql-stored":
            case "ssh":
            case "stax":
            case "stitch":
            case "stomp":
            case "stream":
            case "string-template":
            case "stub":
            case "telegram":
            case "thrift":
            case "tika":
            case "twilio":
            case "twitter-directmessage":
            case "twitter-search":
            case "twitter-timeline":
            case "undertow":
            case "validator":
            case "velocity":
            case "vertx":
            case "vertx-http":
            case "vertx-kafka":
            case "vertx-websocket":
            case "vm":
            case "weather":
            case "web3j":
            case "websocket":
            case "websocket-jsr356":
            case "weka":
            case "wordpress":
            case "workday":
            case "xchange":
            case "xj":
            case "xmlsecurity-sign":
            case "xmlsecurity-verify":
            case "xmpp":
            case "xquery":
            case "xslt":
            case "xslt-saxon":
            case "yammer":
            case "zendesk":
            case "zookeeper":
            return org.apache.camel.dsl.yaml.common.YamlSupport.creteEndpointUri(id, node);
        }
        return null;
    }

    @Override
    public ConstructNode resolve(String id) {
        return node -> org.apache.camel.dsl.yaml.common.YamlSupport.creteEndpoint(id, node, org.apache.camel.model.ToDefinition::new);
    }
}
