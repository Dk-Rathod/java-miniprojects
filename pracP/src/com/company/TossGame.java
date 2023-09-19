package com.company;
import java.util.Scanner;
import java.util.Random;
public class TossGame {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i >= 0; i++) {
            System.out.println("enter 1 or 0");

            int b = s.nextInt();
            if (b == 1) {


                int toss = r.nextInt(0, 2);
                if (toss == 0) {
                    System.out.println("head");
                } else {
                    System.out.println("tale");
                }
            } else if (b == 0) {
                System.out.println("exit");
                break;
            }

        }
    }
}
