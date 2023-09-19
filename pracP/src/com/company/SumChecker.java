package com.company;
import  java.util.Scanner;
import java.util.Random;
public class SumChecker {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int x =0;
        System.out.println("how many times::");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int num1 = r.nextInt(1, 51);
            int num2 = r.nextInt(1, 51);
            int sum = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=  ?");
            int usum = s.nextInt();
            if (sum <= usum && usum <= sum) {
                System.out.println("you are RIGHT!!\n\n");
                x=x+1;

            } else {
                System.out.println("try again\n RIGHT ANS IS:" + sum+"\n\n");
            }

        }
        System.out.println("your SCORE is:: "+x+" out of "+n);
    }

}
