package com.example.shejimoshi.bean.适配器模式.鲁智深缺省;

public class DefaultAdapter implements  AbstractService{
    @Override
    public void serviceOperation1() {

    }

    @Override
    public int serviceOperation2() {
        return 0;
    }

    @Override
    public String serviceOperation3() {
        return null;
    }
}
