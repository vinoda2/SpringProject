package com.xworkz.institute.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InstituteIWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	public InstituteIWebInit() {
		System.out.println(" InstituteIWebInit ");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" InstituteIWebInit getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println(" InstituteIWebInit getServletConfigClasses");
		return new Class[] {InstituteConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" InstituteIWebInit getServletMappings");
		return new String[] {"/"};
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
