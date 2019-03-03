package com.granovskiy;

public class MyMaths {
    public int pow(int n, int p) {
        if(p < 0) {
            throw new IllegalStateException("Power can't be negative.");
        }
        int result = n;
        while(p != 1) {
            result *= n;
            p--;
        }
        return result;
    }

    public int abs(int n) {
        int result = 0;
        if(n < 0) {
            result = -n;
        } else {
            result = n;
        }
        return result;
    }
}
