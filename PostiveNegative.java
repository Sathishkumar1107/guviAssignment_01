package com.java.Demos;

import java.util.Scanner;

public class PostiveNegative {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        if(num1 > 0){
            System.out.println("The given number is positive");
        }
        if(num1 < 0){
            System.out.println("The given number is negative");
        }
    }
}
