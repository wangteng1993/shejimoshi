package com.example.shejimoshi.bean.迭代子模式.白箱子聚集于外禀迭代子;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate agg;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        this.size = agg.size();
        this.index = 0;
    }

    private int index = 0;
    private int size = 0;


    @Override
    public void first() {

        this.index = 0;
    }

    @Override
    public void next() {

        if (this.index < this.size) {
            this.index++;
        }
    }

    @Override
    public boolean isDone() {
        return (this.index >= this.size);
    }

    @Override
    public Object currentItem() {
        return this.agg.getElement(this.index);
    }
}
