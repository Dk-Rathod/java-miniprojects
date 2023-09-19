package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.SocketHandler;


public class GlassG {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for (int i=0;i<5;i++) {
            int r1 = r.nextInt(0,2);
            System.out.println("enter your choice R/L:");
            int a = s.nextInt();

            if (a==r1){
                System.out.println("PASS");

            }
            else{
                System.out.println("Fail");
               // break;
            }
        }
    }
}
