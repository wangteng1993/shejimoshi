package com.example.shejimoshi.bean.代理模式.动态代理;

public class TestProxyFactory {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        System.out.println(userDao.getClass());

        IUserDao proxyInstance = (IUserDao)new ProxyFactory(userDao).getProxyInstance();

        System.out.println(proxyInstance.getClass());

        proxyInstance.save();


    }
}
