package com.company;
import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;
public class tableOfN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NUMBER FOR TABLE:");
        float n = s.nextFloat();
        for(int i= 1;i<=10;i++) {
            System.out.println(n+" * "+i+"-->"+i*n);
            Time t = new Time(5);


        }
    }
}
