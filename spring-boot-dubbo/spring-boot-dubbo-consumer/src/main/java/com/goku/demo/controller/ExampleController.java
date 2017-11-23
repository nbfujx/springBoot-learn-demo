package com.goku.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.goku.demo.api.service.ExampleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017-11-20.
 */
@RestController
public class ExampleController {

    @Reference(version = "1.0.0")
    public ExampleService exampleService;

    @RequestMapping("/")
    public String helloWorld()
    {
        return "helloWorld";
    }

    @RequestMapping("/{str}")
    public String echo(@PathVariable  String str)
    {
        return exampleService.echo(str);
    }
}
