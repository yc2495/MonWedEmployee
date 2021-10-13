package com.company;

public abstract class Employee {

    public final void fileW2Forms(){
        System.out.println("Here are your W2 Tax forms");
    }

    public void WithholdTaxes(){
        System.out.println("Removing "+calculateBiWeeklyPay()*.1+ " of your pay for taxes");
    }

    public abstract double calculateBiWeeklyPay();
}
