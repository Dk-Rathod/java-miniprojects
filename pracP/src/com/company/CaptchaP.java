package com.company;
import java.util.Scanner;
import java.util.Random;
public class CaptchaP {

    public static void captcha(){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        for (int i =1;i>0;i++) {
            int c = r.nextInt();
            System.out.println(c);
            System.out.println("enter this number:");
            int u = s.nextInt();

            if (u <= c && c <= u) {
                System.out.println("PASS!!");
                break;
            } else {
                System.out.println("try again");
            }
        }
    }
    public static void main(String[] args) {
      captcha();
    }
}
