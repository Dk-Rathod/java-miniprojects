package com.company;
import java.util.Scanner;
import java.util.Random;

public class game1P {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        System.out.println("how many times::");
        int y = s.nextInt();
        for (int i = 1; i <= y ; i++) {
            System.out.println("ENTER ONLY 1 OR 2 OR 3 ");
            Random r = new Random();
            int com = r.nextInt(1, 4);
            int user = s.nextInt();
            if (user < 1 || user > 3) {
                System.out.println("ERROR\n\n");
            } else if (user <= com && com <= user) {
                System.out.println("computer:: " + com);
                System.out.println("you are win!!\n\n ");
                x=x+1;
            } else {
                System.out.println("computer:: " + com);
                System.out.println("computer wins!!\n\n");
            }
            System.out.println("your SCORE is :: "+x+"  out of "+y);

        }
    }
}
