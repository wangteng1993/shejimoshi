package com.example.shejimoshi.bean.迭代子模式.白箱子聚集于外禀迭代子;

/**
 * 抽象迭代子角色类
 */
public interface Iterator {
    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
