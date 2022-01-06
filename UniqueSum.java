package com.company;

public class UniqueSum {
    int sum = 0;

    public void uniqueSum(int x, int y, int z) {
        if (x == y && y == z) {
            sum = 0;
        } else if (x == y || x == z) {
            if (x == y) {
                sum += z;
            } else {
                sum += y;
            }
        } else if (y == x || y == z) {
            if (y == x) {
                sum += z;
            } else {
                sum += x;
            }
        } else if (z == x || z == y) {
            if (z == x) {
                sum += y;
            } else {
                sum += x;
            }
        } else {
            sum = x + y + z;
        }  System.out.println(sum);

    }
}
