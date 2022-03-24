package com.example.shejimoshi.bean.建造者模式.复杂场景保险;

public class Client {
    public static void main(String[] args) {
        InstranceContract.ConcreteBuilder builder =
                new InstranceContract.ConcreteBuilder("8888", 123L, 456L);


        InstranceContract contract = null;
        try {
            contract = builder.setPersonName("wt").setOtherData("ceshi").build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        contract.someOperation();


    }
}
