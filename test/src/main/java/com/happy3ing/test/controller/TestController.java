package com.happy3ing.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Dai Mengmeng
 * @Description:
 * @Date: 2020/6/9 17:34
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("test")
    public String test(){
        return "123456";
    }
}
