package com.hwj;

import com.rule.MyRandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author kris
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="CLOUD-DEPT",configuration = MyRandomRule.class)
public class DeptConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class,args);
    }

}
