package com.goku.demo.controller;

import com.goku.demo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * Created by nbfujx on 2017-11-20.
 */
@RestController
@Component
public class ExampleController {


    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/")
    public String helloWorld()
    {
        return "helloWorld";
    }

    @RequestMapping("/{str}")
    public String call(@PathVariable int str)
    {
        System.out.println("start" );
        asyncService.update(str); // ★ 假设这个方法会比较耗时，需要异步执行
        System.out.println("end");
        return "str is "+ str;
    }






}
