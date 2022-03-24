package com.example.shejimoshi.bean.责任链模式.示例;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new GeneralManager();
        Handler handler2 = new DepManager();
        Handler handler3 = new ProjectManager();
        handler2.setSuccessor(handler1);
        handler3.setSuccessor(handler2);
        String test1 = handler3.handlerFeeRequest("张三", 300);
        String test2 = handler3.handlerFeeRequest("lisi", 300);
        String test3 = handler3.handlerFeeRequest("张三", 600);
        String test4 = handler3.handlerFeeRequest("张三", 12000);
    }
}
