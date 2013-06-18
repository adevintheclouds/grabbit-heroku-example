package com.adevintheclouds.util

import com.rabbitmq.client.ConnectionFactory

class RabbitConnectionFactory {

    static ConnectionFactory getConnectionFactory() {
        ConnectionFactory factory = new ConnectionFactory();

        String cloudAmqpUrl = System.getenv("CLOUDAMQP_URL")

        def credentials

        if (cloudAmqpUrl) {

            URI uri = new URI(System.getenv("CLOUDAMQP_URL"));

            credentials = [ username : uri.userInfo.split(":")[0],
                    password : uri.userInfo.split(":")[1],
                    host : uri.host,
                    port : uri.port,
                    virtualHost : uri.path.substring(1)]

            factory.with {
                username = credentials.username
                password = credentials.password
                host = credentials.host
                port = credentials.port
                virtualHost = credentials.virtualHost
            }
        }

        factory
    }

}
