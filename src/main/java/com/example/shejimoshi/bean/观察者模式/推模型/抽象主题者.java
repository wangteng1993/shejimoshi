package com.example.shejimoshi.bean.观察者模式.推模型;

import java.util.ArrayList;
import java.util.List;

public abstract class 抽象主题者 {

    private List<抽象观察者> list = new ArrayList<抽象观察者>();

    public void attach(抽象观察者 observice) {
        list.add(observice);
        System.out.println("attach one");
    }

    public void detach(抽象观察者 observice) {
        list.remove(observice);
        System.out.println("delete one");

    }

    public void nodifyObservices(String newState) {
        for (抽象观察者 observice : list) {
            observice.update(newState);
        }
    }


}
