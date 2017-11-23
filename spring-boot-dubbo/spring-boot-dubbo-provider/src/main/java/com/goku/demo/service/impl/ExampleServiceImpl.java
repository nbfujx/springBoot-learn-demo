package com.goku.demo.service.impl;

import com.goku.demo.api.service.ExampleService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by nbfujx on 2017-11-23.
 */
@Service(version = "1.0.0")
public class ExampleServiceImpl implements ExampleService {

    @Override
    public String echo(String str) {
        return "hello"+ str;
    }
}
