package com.pyxisportal.opentech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OpenTechApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenTechApplication.class, args);
	}
}
