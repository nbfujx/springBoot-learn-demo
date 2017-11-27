package com.goku.demo.config;

import com.goku.demo.controller.ExampleController;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by nbfujx on 2017/11/27.
 */
@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private ExampleController examplecontroller;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,examplecontroller);
        endpoint.publish("/ExampleService");//接口发布在 /NetbarServices 目录下
        return endpoint;
    }

}
