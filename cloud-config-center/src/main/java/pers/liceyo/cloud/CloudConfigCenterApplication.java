package pers.liceyo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liceyo
 * @version 2018/6/13
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class CloudConfigCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigCenterApplication.class, args);
	}
}
