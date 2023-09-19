package com.company;
import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][]a=new int[3][3];
        int [][]b =new int[3][3];
        int [][]sum = new int[3][3];
        System.out.println("enter value for matrix A:");
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("enter value for matrix B:");
        for (int i=0;i<b.length;i++){
            for (int j =0;j<b[i].length;j++){
                b[i][j] = s.nextInt();

            }
        }
        for (int i=0;i<sum.length;i++){
            for(int j=0;j < sum[i].length;j++){
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of A and B is:");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                System.out.print(" "+sum[i][j]);
            }
            System.out.println("\n");
        }
    }
}
