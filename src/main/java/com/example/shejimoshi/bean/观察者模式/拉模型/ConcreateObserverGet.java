package com.example.shejimoshi.bean.观察者模式.拉模型;


public class ConcreateObserverGet implements ObserverGet {
    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreateSubject) subject).getState();
        System.out.println("observerState state" + this.observerState);
    }
}
