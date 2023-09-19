package com.company;
import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bit = s.nextInt();
        double sum = 0;
        double x = 0;
        double sum2 = 0;

        for(int i=0;i<bit;i++) {
            int n0 =s.nextInt();
            if (n0==0||n0==1)
            sum =((Math.pow(2,x)) * n0);
            sum2 = sum2 + sum;
            //System.out.println("x =" +x);
            //System.out.println("sum= "+sum);
            //System.out.println("sum2= "+sum2);
            x++;

        }
        System.out.println(sum2 );

    }
}
