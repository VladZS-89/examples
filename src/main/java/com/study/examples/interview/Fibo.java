package com.study.examples.interview;

public class Fibo {
    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= 9; i++) {
            a = a + b;
            b = a - b;
            System.out.print(a + " ");
        }
    }
}
