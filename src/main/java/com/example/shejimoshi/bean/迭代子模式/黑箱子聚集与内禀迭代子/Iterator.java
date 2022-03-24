package com.example.shejimoshi.bean.迭代子模式.黑箱子聚集与内禀迭代子;

/**
 * 抽象迭代子角色类
 */
public interface Iterator {
    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
