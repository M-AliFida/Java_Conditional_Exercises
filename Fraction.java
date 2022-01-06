package com.company;

public class Fraction {

    public int numerator;
    public int denominator;

    public void printInfo(){
        System.out.println(numerator + "/" + denominator);

    }

    public String getInfo(){
        return (numerator + "/" + denominator);

    }

    public Fraction multiply(Fraction newFraction){
        Fraction output = new Fraction();
        output.numerator = this.numerator * newFraction.numerator;
        output.denominator = this.denominator * newFraction.denominator;
        return output;

    }

}
