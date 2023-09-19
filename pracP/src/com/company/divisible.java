package com.company;
import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number ");
        int num = s.nextInt();
        System.out.println("enter start num :");
        int start = s.nextInt();
        System.out.println("enter end num :");
        int end = s.nextInt();

        for(int i=start;i<=end;i++)
        {
            if(i%num==0){
                System.out.println(i);
            }

        }
        System.out.println("these number are divisable by "+num);
    }
}
