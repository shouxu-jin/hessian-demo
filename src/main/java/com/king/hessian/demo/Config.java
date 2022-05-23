package com.king.hessian.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

@Configuration
public class Config {
    @Autowired
    private Hello hello;

    @Bean(name = "/hello")
    public HessianServiceExporter hessianServiceExporter() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(hello);
        exporter.setServiceInterface(Hello.class);
        return exporter;
    }
}
