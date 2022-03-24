package com.example.shejimoshi.bean.迭代子模式.白箱子聚集于外禀迭代子;

/**
 * 抽象聚集角色
 */
public abstract class Aggregate {
    public abstract Iterator createIterator();
}
