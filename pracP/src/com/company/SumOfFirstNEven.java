package com.company;
import java.util.Scanner;

public class SumOfFirstNEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("ENTER NUMBER:");
        int num = s.nextInt();

        while (i<num) {
            sum = sum + (2*i);

            i++;
        }

        System.out.println(sum);
    }
}
