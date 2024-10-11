package com.java.Demos;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(n - i);
                } else {
                    System.out.print(n - j);
                }
            }

            System.out.println();
        }
    }
}
