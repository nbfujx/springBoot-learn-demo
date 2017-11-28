package com.goku.demo.controller;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by nbfujx on 2017/11/27.
 */
@Component
@WebService(serviceName = "ExampleService"
        ,targetNamespace="http://controller.demo.goku.com/")
public class ExampleController {

    @WebMethod
    public String echo(@WebParam(name = "para") String para) {
    return "hello"+para;
    }
}
