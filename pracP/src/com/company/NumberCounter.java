package com.company;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number::");
        int num=s.nextInt();
        int c=0;
        for (int i=0;num>0;i++){
            int a=num%10;
            if (a==5){
                c++;

            }
            num=num/10;
        }
        System.out.println(c);
    }
}
