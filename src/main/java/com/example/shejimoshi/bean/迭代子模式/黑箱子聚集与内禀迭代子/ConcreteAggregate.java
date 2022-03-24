package com.example.shejimoshi.bean.迭代子模式.黑箱子聚集与内禀迭代子;


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
        return new ConcreteIterator();
    }


    private class ConcreteIterator implements Iterator {

        private int index = 0;
        private int size = 0;

        public ConcreteIterator() {
            this.index = 0;
            this.size = objArray.length;
        }


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
            return objArray[this.index];
        }
    }



}
