package com.company;
import java.util.Scanner;

public class Trycatch {
    public static void div(){
        Scanner s = new Scanner(System.in);

        try {
            float n1 = s.nextInt();
            float n2 = s.nextInt();

            float div = n1 / n2;
            System.out.println(div);
        }
        catch (ArithmeticException ex){
            System.out.println("cannot divide by 0");
        }
    }


    public static void main(String[] args) {
        div();

    }
}
