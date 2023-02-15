package com.xworkz.stop.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz")
@Configuration
public class StopConfiuration {

	public StopConfiuration() {
		System.out.println("this is StopConfiuration ");
	}
	
	@Bean 
	public ViewResolver view() {
		InternalResourceViewResolver iv=new InternalResourceViewResolver();
		iv.setPrefix("/");
		iv.setSuffix(".jsp");
		return iv;
	}
}
