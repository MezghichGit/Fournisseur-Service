package com.sip.ams;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class FournisseurServiceApplication {

	@Value("${cible}")
	private String groupe;
	
	@RequestMapping("/provider")
	public String fournisseur()
	{
		return "Bonjour " + groupe;
	}
	public static void main(String[] args) {
		SpringApplication.run(FournisseurServiceApplication.class, args);
	}

}
