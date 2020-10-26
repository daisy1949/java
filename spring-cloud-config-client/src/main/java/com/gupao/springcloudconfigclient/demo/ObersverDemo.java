package com.gupao.springcloudconfigclient.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/05/10
 */
public class ObersverDemo {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(arg);
            }
        });
        observable.setChanged();
        observable.notifyObservers("hello");

    }

    static class MyObservable extends Observable{
        @Override
        protected synchronized void setChanged() {
            super.setChanged();
        }
    }
}
