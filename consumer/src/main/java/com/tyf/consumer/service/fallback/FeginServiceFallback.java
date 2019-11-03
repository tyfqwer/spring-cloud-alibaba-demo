package com.tyf.consumer.service.fallback;

import com.tyf.consumer.service.FeginService;
import org.springframework.stereotype.Component;

@Component
public class FeginServiceFallback implements FeginService {
    @Override
    public String echo(String str) {
        return "请稍后再试";
    }

    @Override
    public String port() {
        return "请稍后再试";
    }
}
