package com.pch7128.jieun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WantedPreOnboardingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WantedPreOnboardingBackendApplication.class, args);
	}

}
