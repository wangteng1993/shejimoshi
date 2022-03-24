package com.example.shejimoshi.bean.建造者模式.复杂场景保险;

import lombok.Data;

@Data
public class InstranceContract {
    String contractId;
    String personName;
    String companyName;
    long beginDate;
    long endDate;
    String otherData;

    public InstranceContract(ConcreteBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;

    }

    void someOperation() {
        System.out.println("合同编号"+this.contractId);
        System.out.println(this.toString());
    }
    @Data
    public static class ConcreteBuilder {
        String contractId;
        String personName;
        String companyName;
        long beginDate;
        long endDate;
        String otherData;

        ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;

        }

        public InstranceContract build() throws Exception {

            if (contractId == null) {
                throw new Exception("合同编号为空");
            }
            boolean signPerson = (personName != null&&personName.length()>0);
            boolean signCompany = (companyName != null&&companyName.length()>0);

            if (signCompany&&signPerson){
                throw new Exception("公司和个人不可同时有值");
            }
            if (!signCompany&&!signPerson){
                throw new Exception("公司和个人不可同时无值");
            }

            if (beginDate<=0){
                throw new Exception("时间不可为空");
            }

            if (endDate<=0){
                throw new Exception("时间不可为空");
            }
            if (beginDate>=endDate){
                throw new Exception("开始不可大于结束");
            }


            return  new InstranceContract(this);




        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }
    }


}
