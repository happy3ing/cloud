package com.happy3ing.feign.controller;

import com.happy3ing.feign.client.CommonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Dai Mengmeng
 * @Description:
 * @Date: 2020/6/9 15:55
 */
@RestController
@RequestMapping("/feign")
public class TestController {

    @Autowired
    private CommonClient commonClient;

    @GetMapping("/test")
    public String test(){
        return commonClient.test();
    }
}
