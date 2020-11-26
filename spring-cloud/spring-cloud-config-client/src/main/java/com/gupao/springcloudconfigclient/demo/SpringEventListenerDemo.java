package com.gupao.springcloudconfigclient.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/09/14
 */
public class SpringEventListenerDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringEventListenerDemo.class);

        context.addApplicationListener((event -> {System.out.println(event.getSource());}));

        context.addApplicationListener(new ApplicationListener<MyApplicationEvent>() {
            @Override
            public void onApplicationEvent(MyApplicationEvent event) {
                System.out.println(event.getSource());
            }
        });

        context.publishEvent(new MyApplicationEvent("hello world"));
    }

    public static class MyApplicationEvent extends ApplicationEvent{

        /**
         * Create a new {@code ApplicationEvent}.
         *
         * @param source the object on which the event initially occurred or with
         *               which the event is associated (never {@code null})
         */
        public MyApplicationEvent(Object source) {
            super(source);
        }
    }
}
