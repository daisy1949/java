package com.gupao.springcloudconfigclient.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/05/10
 */
public class SpringApplicationListenerDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApplicationListenerDemo.class);
        context.addApplicationListener(new ApplicationListener<SpringApplicationEventDemo>() {
            @Override
            public void onApplicationEvent(SpringApplicationEventDemo applicationEvent) {
                System.out.println(applicationEvent.getSource());
            }
        });
        context.publishEvent(new SpringApplicationEventDemo("hello,world"));

    }

    public static class  SpringApplicationEventDemo extends ApplicationEvent{


        public SpringApplicationEventDemo(Object source) {
            super(source);
        }
    }
}
