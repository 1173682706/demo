package com.example.demo.controller;

import com.example.demo.helper.PatternFactory;
import com.example.demo.service.strategy.ITestStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xin.wang
 * @version v1.0
 * @date 2022/7/18
 * @work
 */

@RestController
public class DemoController {


    @GetMapping(value = {"/demo/{type}/{id}/{name}", "/demo/{type}/{id}", "/demo/{type}"})
    public String demo(
            @PathVariable(value = "type", required = true) String type,
            @PathVariable(value = "id", required = false) Integer id,
            @PathVariable(value = "name", required = false) String name
    ) {
        Object o = PatternFactory.get(type);
        ITestStrategy testStrategy = (ITestStrategy) o;
        return testStrategy.getOrder();
    }


}
