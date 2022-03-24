package com.example.shejimoshi.bean.代理模式.动态代理;

public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
