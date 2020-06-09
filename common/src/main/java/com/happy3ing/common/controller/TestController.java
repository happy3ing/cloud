package com.happy3ing.common.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Dai Mengmeng
 * @Description:
 * @Date: 2020/6/9 11:09
 */
@RestController
@RefreshScope
@RequestMapping("/common")
public class TestController {

    @Value("${test.name}")
    private String name;

    @GetMapping(value = "test")
    public String test(){
        return name;
    }
}
