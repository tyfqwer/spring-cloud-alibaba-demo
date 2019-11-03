package com.tyf.dubbo.service;

import com.tyf.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Value("${dubbo.protocol.port}")
    private String port;


    @Override
    public String echo(String str) {
        return "hello dubbo "+str +"port:"+port;
    }
}
