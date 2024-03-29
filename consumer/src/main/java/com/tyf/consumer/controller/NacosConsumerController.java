package com.tyf.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NacosConsumerController {
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str){
        return restTemplate.getForObject("http://nacos-provider/echo/"+str,String.class);
    }
}
