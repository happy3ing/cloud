package com.happy3ing.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Dai Mengmeng
 * @Description:
 * @Date: 2020/6/10 23:00
 */
@RestController
@RequestMapping("/ribbon")
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://common/common/test",String.class);
    }

    @GetMapping("/test1")
    public String test1(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8888/common/test",String.class);
    }
}
