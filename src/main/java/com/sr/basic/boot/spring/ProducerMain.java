package com.sr.basic.boot.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
@EnableScheduling
public class ProducerMain {

	public static void main(String[] args) {
		SpringApplication.run(ProducerMain.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Inspect Beans");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String bean : beanNames)
				System.out.println(bean);
		};
	}
}
