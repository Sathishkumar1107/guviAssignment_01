package com.java.Demos;

import java.util.Scanner;

public class DiscountRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();


        if(purchaseAmount > 500 && purchaseAmount <= 1000){
            double discount = purchaseAmount * 0.10;
            double finalAmount = purchaseAmount - discount;
            System.out.println("you got 10% of discount and final amount is " + finalAmount);
        } else if(purchaseAmount > 1000){
            double discount = purchaseAmount * 0.20;
            double finalAmount = purchaseAmount - discount;
            System.out.println("you got 20% of discount and final amount is " + finalAmount);
        } else{
            System.out.println("no discount is applied");
        }




    }
}
