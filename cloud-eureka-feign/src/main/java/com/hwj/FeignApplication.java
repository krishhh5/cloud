package com.hwj;

import com.rule.MyRandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author kris
 */
@SpringBootApplication
@EnableEurekaClient

@EnableFeignClients(basePackages = {"com.hwj"})

@RibbonClient(name="CLOUD-DEPT",configuration = MyRandomRule.class)
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }

}
