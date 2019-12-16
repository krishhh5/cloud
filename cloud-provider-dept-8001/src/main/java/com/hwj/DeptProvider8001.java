package com.hwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kris
 */
//@MapperScan(basePackages = {"com.hwj.dao"})
@SpringBootApplication()
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8001{

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001.class,args);
    }
}
