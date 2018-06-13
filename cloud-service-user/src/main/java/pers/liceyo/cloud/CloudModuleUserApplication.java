package pers.liceyo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liceyo
 * @version 2018/6/12
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudModuleUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudModuleUserApplication.class, args);
	}
}
