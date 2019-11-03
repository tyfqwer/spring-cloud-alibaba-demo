package com.tyf.consumer.controller;

import com.tyf.consumer.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class FeginController {

    @Autowired
    private FeginService feginService;

    @GetMapping(value = "/echoFeign/{str}")
    public String echo(@PathVariable String str){
        return feginService.echo(str);
    }

    @GetMapping(value = "/port")
    public String port(){
        return feginService.port();
    }

    @Value("${user.name}")
    private String name;

    @GetMapping(value = "/config")
    public String config(){
        return name;
    }

}
