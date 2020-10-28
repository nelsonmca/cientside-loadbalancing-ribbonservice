package io.nelson.nadar.ribbontimeservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class RibbonTimeServiceApplication {

	@Value("${server.port}")
	private String port;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RibbonTimeServiceApplication.class, args);
	}
	
	@RequestMapping
	public String getTime() {
		return "Time is "+ new Date().toString()+ " from port " + port;
	}

}
