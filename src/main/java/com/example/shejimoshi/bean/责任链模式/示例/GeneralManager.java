package com.example.shejimoshi.bean.责任链模式.示例;

public class GeneralManager extends Handler{
    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000) {
            if ("张三".equals(user)) {
                str = "同意";
                System.out.println("同意");
            } else {
                str = "失败";
                System.out.println("失败");
            }
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handlerFeeRequest(user, fee);
            }
        }
        return str;

    }
}
