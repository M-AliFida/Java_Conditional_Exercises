package com.company;

public class Calculator {

    public void addition(int a, int b){
        int output = a + b;
        System.out.println(output);
    }

    public void subtraction(int a, int b){
        int output = a - b;
        System.out.println(output);
    }

    public void division(int a, int b){
        if (a > b) {
            double output = a / b;
            System.out.println(output);
        } else {
            System.out.println("Invalid Division!");
        }
    }
}
