package com.example.shejimoshi.bean.迭代子模式.黑箱子聚集与内禀迭代子;

public class Client {
    public void operation() {
        Object[] objArray = {"one", "two"};
        ConcreteAggregate agg = new ConcreteAggregate(objArray);
        Iterator iterator = agg.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }



    }



    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }
}
