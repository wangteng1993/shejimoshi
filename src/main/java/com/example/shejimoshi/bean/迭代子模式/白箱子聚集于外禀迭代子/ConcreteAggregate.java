package com.example.shejimoshi.bean.迭代子模式.白箱子聚集于外禀迭代子;

/**
 * 具体 聚集角色
 */
public class ConcreteAggregate extends Aggregate {


    private Object[] objArray = null;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }


    public Object getElement(int index) {
        if (index < objArray.length) {
            return objArray[index];
        } else {
            return null;
        }
    }

    public int size() {
        return objArray.length;
    }


}
