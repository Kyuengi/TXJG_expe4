package com.example.txjg4_1;

import javax.xml.ws.Endpoint;

public class TaxCalculationWebService {
    public static void main(String[] args) {
        String address="http://localhost:8088/TaxCalculationService";
        Endpoint.publish(address,new TaxCalculationServiceImpl());
        System.out.println("个人所得税计算程序已发布为web服务："+address);
    }
}
