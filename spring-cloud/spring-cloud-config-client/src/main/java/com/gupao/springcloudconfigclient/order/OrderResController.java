package com.gupao.springcloudconfigclient.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/11/16
 */
@RestController
public class OrderResController {



    @GetMapping("/order")
    public String getOrder(){
        return "first order";
    }
}
