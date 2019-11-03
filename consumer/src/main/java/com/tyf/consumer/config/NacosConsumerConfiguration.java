package com.tyf.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class NacosConsumerConfiguration {

    //在RestTemplate上添加@LoadBalanced注解，使RestTemplate支持负载均衡，如果不加@LoadBalanced注解的话，会报java.net.UnknownHostException异常，此时无法通过注册到Nacos Server上的服务名来调用服务，因为RestTemplate是无法从服务名映射到ip:port的，映射的功能是由LoadBalancerClient来实现的。
    //
    //作者：爱订不订
    //链接：https://juejin.im/post/5c984319e51d450b084950a2
    //来源：掘金
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}