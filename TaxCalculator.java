package com.company;

// obviously, there is a lot of room for improvement
// however the logic remains the same.


public class TaxCalculator {
    public double tax = 0;
    public double taxWhichBracket(double salary) {
        if(salary > 0 && salary <= 14999) {
            tax = 0;
        } else if(salary > 14999 && salary <= 19999) {
            tax = .10;
        } else if(salary > 19999 && salary <= 29999) {
            tax = .15;
        } else if(salary > 29999 && salary <= 44999) {
            tax = .20;
        } else {
            tax = .25;
        } return tax;

    }
    public double taxCalculation(double salary) {
       taxWhichBracket(salary);
       double taxMyIncome = salary * tax;
       return taxMyIncome;
    }

}
