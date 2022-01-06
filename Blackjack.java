package com.company;

// not using a return as this makes it easier to verify result and test code

public class Blackjack {
    public void blackJack(int x, int y) {
        if(x <= 21 && y <= 21) {
            if(x == y) {
                System.out.println(x + " " + y);
            } else if(x > y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        } else if((x <= 21 || y <= 21)) {
            if(x <= 21) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        } else {
            System.out.println(0);
        }
    }
}
