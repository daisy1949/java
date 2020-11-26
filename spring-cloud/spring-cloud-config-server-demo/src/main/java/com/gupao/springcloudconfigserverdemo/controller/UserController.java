package com.gupao.springcloudconfigserverdemo.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gupao.springcloudconfigserverdemo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/11/16
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    //@Autowired
   // LoadBalancerClient loadBalancerClient;
    /**
     * LoadBalancerAutoConfiguration
     * @LoadBalanced
     * 	@Autowired(required = false)
     * 	private List<RestTemplate> restTemplates = Collections.emptyList();
     */
    @Qualifier
    @Autowired
    List<User> list = new ArrayList<>();



    /**
     * @return
     */
    @GetMapping("/user/get")
    public int  getUser(){

        return list.size();
    }

//    /**
//     * 方式一
//     * @param id
//     * @return
//     */
//    @GetMapping("/user/id/{id}")
//    public String getUser(@PathVariable String id){
//        ServiceInstance instance = loadBalancerClient.choose("spring-cloud-config-client");
//        String url = String.format("http://%s:%s/order",instance.getHost(),instance.getPort());
//        //调用方式 httpClient okHttp restTemplate
//        return restTemplate.getForObject(url,String.class);
//    }

    /**
     * 方式二
     * @param orderId
     * @return
     */
    @GetMapping("/user/order/{orderId}")
    public String getOrder(@PathVariable("orderId") String orderId){
        //调用方式 httpClient okHttp restTemplate
        return restTemplate.getForObject("http://spring-cloud-config-client/order",String.class);
    }
}
