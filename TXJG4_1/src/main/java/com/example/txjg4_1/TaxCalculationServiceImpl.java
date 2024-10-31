package com.example.txjg4_1;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.txjg4_1.TaxCalculationService")
public class TaxCalculationServiceImpl implements TaxCalculationService{

    @Override
    public double calculateTax(double income) {
        if (income <= 3500) {
            return 0;
        } else if (income <= 5000) {
            return (income - 3500) * 0.03;
        } else if (income <= 8000) {
            return (income - 3500) * 0.1 - 105;
        } else if (income <= 12500) {
            return (income - 3500) * 0.2 - 555;
        } else if (income <= 38500) {
            return (income - 3500) * 0.25 - 1005;
        } else {
            return (income - 3500) * 0.3 - 2755;
        }
    }
}
