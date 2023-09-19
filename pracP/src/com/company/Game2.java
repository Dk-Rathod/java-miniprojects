package com.company;
import java.util.Scanner;
import java.util.Random;
public class Game2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("ENTER NAME OF 1ST PLAYER");
        String name1 = s.nextLine();
        int s1 = 0;
        System.out.println("ENTER NAME OF 2ND PLAYER");
        String name2 = s.nextLine();
        System.out.println("ENTER NAME OF 3RD PLAYER");
        int s2 = 0;
        String name3 = s.nextLine();
        int s3 = 0;
        for (int i = 1; i > 0; i++) {
            System.out.println("\n \nENTER  1  FOR PLAY\n ENTER  0  FOR QUIT");
            int x = s.nextInt();
            if (x<=1&&x>=1) {
                int num = r.nextInt(1, 4);
                if (num <= 1 && num >= 1) {
                    System.out.println("WINNER::--> " + name1);
                    s1=s1+1;

                } else if (num <= 2 && num >= 2) {
                    System.out.println("WINNER::--> " + name2);
                    s2++;
                } else if (num <= 3 && num >= 3) {
                    System.out.println("WINNER::--> " + name3);
                    s3=s3+1;
                }
            }
            else {
                System.out.println("EXIT");
                System.out.println("SCORE:: \n"+name1+ " = " +s1+"\n"+name2+" = "+s2+"\n"+name3+" = "+s3);
                break;
            }
        }
    }
}
