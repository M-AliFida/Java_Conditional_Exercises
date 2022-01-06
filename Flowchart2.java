package com.company;

public class Flowchart2 {
    // takes input A (int) and prints statement (no need to return)
    public void flowchart (int a) {
        // decision point
        if (a > 2000) {
            System.out.println("A");
        // decision point
            if (a > 6000) {
                System.out.println("C");
            } else {
                System.out.println("B");
                // decision point
                if (a > 4000) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }
        } // initial if (a > 2000) ends here
            else {
                System.out.println("1");
                // decision point
                if (a > 100) {
                    System.out.println("3");
                    // decision point
                    if (a > 600) {
                        System.out.println("5");
                    } else {
                        System.out.println("4");
                        // decision point
                        if (a > 500) {
                            System.out.println("6");
                        } else {
                            System.out.println("7");
                        }
                    }
                } else {
                    System.out.println("2");
                }
            } // initial else pathway ends here
        }

    }

//            input = 2000

//            1
//            3
//            5
