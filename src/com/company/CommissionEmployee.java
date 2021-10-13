package com.company;

public class CommissionEmployee extends Employee{
    private int numberOfSales;
    public static final double commissionRate = 100;

    public CommissionEmployee(){
        numberOfSales = 0;
    }

    public void makeSale(){
        numberOfSales++;
    }

    @Override
    public double calculateBiWeeklyPay(){
        var pay = 1000+ numberOfSales*commissionRate;
        numberOfSales = 0;
        return pay;
    }
}
