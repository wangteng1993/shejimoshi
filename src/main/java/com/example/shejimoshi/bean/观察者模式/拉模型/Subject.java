package com.example.shejimoshi.bean.观察者模式.拉模型;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题者
 */
public abstract class Subject {

    private List<ObserverGet> list = new ArrayList<ObserverGet>();

    public void attach(ObserverGet observice) {
        list.add(observice);
        System.out.println("attach one");
    }

    public void detach(ObserverGet observice) {
        list.remove(observice);
        System.out.println("delete one");

    }

    public void nodifyObservices() {
        for (ObserverGet observice : list) {
            observice.update(this);
        }
    }


}
