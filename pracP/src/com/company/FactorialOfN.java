package com.company;
import  java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char x =0;

        int sum = 1;
        System.out.println("ENTER NUMBER::");


            int n = s.nextInt();


            for (int i = n; i > 0; i--) {
                sum = sum * i;

            }
            System.out.println("FACTORIAL : "+sum);

    }
}
