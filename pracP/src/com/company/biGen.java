package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
public class biGen {
    public static void main(String[] args) {
        Random r1 = new Random();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <= 11; i++) {
            int e1 = r1.nextInt(0, 2);
            int e2 = r1.nextInt(0, 2);
            int e3 = r1.nextInt(0, 2);
            int e4 = r1.nextInt(0, 2);
            System.out.println(e1 +""+e2+""+e3+""+e4);
            int b0= e4 ;
            int b1 = e3 * 2;
            int b2 = e2 * 4;
            int b3 = e1 * 8;

            int d = b0+b1+b2+b3;
            //System.out.println(d);
            System.out.println("enter your answer:");
            int u = s.nextInt();
            if(u==d) {
                System.out.println("you are right");
            }
            else {
                System.out.println("wrong!! right answer is :: "+d);
            }

        }
    }
}
