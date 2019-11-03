package com.tyf.consumer.service;

import com.tyf.consumer.service.fallback.FeginServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nacos-provider",fallback = FeginServiceFallback.class)
public interface FeginService {

    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str")String str);

    @GetMapping(value = "/port")
    String port();
}
