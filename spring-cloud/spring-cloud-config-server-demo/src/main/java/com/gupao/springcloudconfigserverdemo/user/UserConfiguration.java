package com.gupao.springcloudconfigserverdemo.user;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/11/25
 */
@Configuration
public class UserConfiguration {

    @Qualifier
    @Bean("user1")
    public User user1(){
        return new User();
    }

    @Qualifier
    @Bean("user2")
    public User user2(){
        return new User();
    }
}
