package cn.net.yzl.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableSwagger
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"cn.net.yzl.customer.service.*"})
@MapperScan("cn.net.yzl.customer.dao")
public class YzlCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YzlCustomerApplication.class, args);
    }

}
