package com.gupao.springcloudconfigserverdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/10/26
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String  getIndex(){
        return "hello world";
    }
}
