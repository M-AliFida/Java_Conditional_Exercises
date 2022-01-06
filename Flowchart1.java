package com.company;

//If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
//        For example:
//
//        Input (1, 2, true) -> 3
//        Input (3, 3, false) -> 9
//        Input (1, 1, true) -> 2


public class Flowchart1 {

    int sum;
    int product;

    // must return int (numbers)
    public int sumOrProduct(int n1, int n2, boolean isSum) {
        if (isSum == true) {
            sum = n1 + n2;
            return sum;
        } else {
            product = n1 * n2;
            return product;
        }
    }

    public int sumElseProduct(int num1, int num2, boolean isAddition) {
        if (isAddition == true) {
            return num1 + num2;
        } else {
            return num1 * num2;
        }

    }
}


