package com.example.txjg4_1;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TaxCalculationService {
    @WebMethod
    double calculateTax(double income);
}
