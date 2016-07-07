package com.springbootsecure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

    @Value("${staticresourceloader.imageFileLocation.path}")
    private String staticImageFilePath;

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("staticImageFilePath: " + staticImageFilePath);
        registry.addResourceHandler("/pics/**").addResourceLocations(staticImageFilePath);
    }

}
