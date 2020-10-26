package com.gupao.springcloudconfigclient.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;


/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/09/14
 */
public class ObserverDemo {
    public static void main(String[] args) {
        /**
         * 1、实例化一个观察者模式
         * 2、加上一个事件监听
         * 3、发布一个事件（注意setChange）
         */
        MyObserver observable = new MyObserver();
        observable.setChanged();
        observable.addObserver((o, arg) -> System.out.println("更新了"));
        //推得模式，是被动感知的
        observable.notifyObservers("hello world");
        array();
    }

    /**
     * 迭代器是一种拉模式
     */
    private static void array(){
        List<Integer>  list = Arrays.asList(1,2,3,4,5);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static class MyObserver extends Observable{
        @Override
        protected void setChanged() {
            super.setChanged();
        }
    }
}
