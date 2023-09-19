package com.company;
import java.util.Scanner;

public class WhichNIsBig {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        if (num1 > num2) {
            System.out.println(num1 + "  is big!!");
            System.out.printf("difference between two number are:: %f ", num1-num2);

        } else if (num2 > num1) {
            System.out.println(num2 + "  is big!!");
            System.out.printf("difference between two number are:: %f ", num2-num1);
        } else {
            System.out.println("both number are same");
        }
    }
}
