package com.happy3ing.feign.hystrix;

import com.happy3ing.feign.client.CommonClient;
import org.springframework.stereotype.Component;

/**
 * @Author: Dai Mengmeng
 * @Description:
 * @Date: 2020/6/9 16:39
 */
@Component
public class CommonHystrix implements CommonClient {

    @Override
    public String test(){
        return "0308";
    }
}
