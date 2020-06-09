package com.happy3ing.feign.client;

import com.happy3ing.feign.hystrix.CommonHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Dai Mengmeng
 * @Description:
 * @Date: 2020/6/9 15:58
 */
@FeignClient(name = "common",fallback = CommonHystrix.class)
public interface CommonClient {

    @GetMapping(value = "/common/test")
    String test();
}
