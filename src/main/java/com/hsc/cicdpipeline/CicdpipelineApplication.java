package com.hsc.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hsc.cicdpipeline.web")
public class CicdpipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdpipelineApplication.class, args);
	}
}
