package com.company;
import java.util.Scanner;


class IntC {
    public static void Interest(){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER TOTAL AMOUNT:: ");
        float P = s.nextFloat();
        System.out.println("ENTER RATE:: ");
        float R = s.nextFloat();
        System.out.println("ENTER DURATION (IN YEARS)::");
        float T = s.nextFloat();
        float r = R/100;
        float in = P*T*r;
        System.out.println("INTEREST : " +in);
        float F = P+in;
        System.out.println("TOTAL AMOUNT AFTER INTEREST :: "+F);

    }
}
public class InterestCal {


    public static void main(String[] args) {
        IntC.Interest();


    }
}
