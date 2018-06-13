package pers.liceyo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CloudGetewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGetewayZuulApplication.class, args);
	}
}
