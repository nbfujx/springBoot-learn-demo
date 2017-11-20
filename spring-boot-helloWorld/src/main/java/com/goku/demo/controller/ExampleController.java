package com.goku.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017-11-20.
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public String helloWorld()
    {
        return "helloWorld";
    }

    @RequestMapping("/{str}")
    public String helloWorld(@PathVariable  String str)
    {
        return "hello"+ str;
    }
}
