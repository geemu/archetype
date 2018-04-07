package com.chenfangming.archetype.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Fangming.Chen
 * Email:cfmmail@sina.com
 * Date: 2018-04-07 18:21:00
 * Description: 注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryApplication {

    public static void main(String[] args) {

        SpringApplication.run(RegistryApplication.class, args);

    }
}
