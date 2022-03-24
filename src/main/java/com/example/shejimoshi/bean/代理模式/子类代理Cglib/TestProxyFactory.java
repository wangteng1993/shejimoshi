package com.example.shejimoshi.bean.代理模式.子类代理Cglib;


public class TestProxyFactory {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getClass());

        UserDao proxyInstance = (UserDao)new ProxyFactory(userDao).getProxyInstance();


        proxyInstance.save();


    }
}
