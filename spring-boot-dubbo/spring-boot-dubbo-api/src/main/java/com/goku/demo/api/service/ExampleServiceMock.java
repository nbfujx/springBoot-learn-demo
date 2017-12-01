package com.goku.demo.api.service;

import org.springframework.stereotype.Service;

/**
 * Created by nbfujx on 2017-11-27.
 */
@Service
public class ExampleServiceMock  implements ExampleService {
    @Override
    public String echo(String str) {
        return "hello"+ str+",this is error!";
    }
}
