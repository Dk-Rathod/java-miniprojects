package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class TTT {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
        char [][] a =
                {{'a','b','c'},{'d','e','f'},{'g','h','i'}};

        for (int i=0; i<3;i++){
            System.out.print("\n");//for print array
            for (int j=0;j<a[i].length;j++){
                System.out.print(" | "+a[i][j]+" | ");
            }
        } int c=0;
        int c2=0;

        for (int i=0;i<100;i++){


            if (c%2==0){

                System.out.println("\n\nturn = O\n");
                String t=s.next();


                switch (t) {
                    case "a":
                        if(a[0][0]=='a'){
                        a[0][0] = 'O'; c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "b":
                        if(a[0][1]=='b'){
                            a[0][1] = 'O';
                            c2++;

                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "c":  if(a[0][2]=='c'){
                        a[0][2] = 'O';
                        c2++;

                    }
                    else{
                        System.out.println("Error:place is already occupied");}
                    break;
                    case "d":
                        if(a[1][0]=='d'){
                            a[1][0] = 'O';
                            c2++;

                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "e":
                        if(a[1][1]=='e'){
                            a[1][1] = 'O';
                            c2++;

                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "f":
                        if(a[1][2]=='f'){
                            a[1][2] = 'O';
                            c2++;

                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "g":

                    if(a[2][0]=='g'){
                        a[2][0] = 'O';
                        c2++;

                    }
                    else{
                        System.out.println("Error:place is already occupied");}
                    break;
                    case "h":
                        if(a[2][1]=='h'){
                            a[2][1] = 'O';
                            c2++;

                        }
                        else {
                            System.out.println("Error:place is already occupied");
                        }
                        break;
                    case "i":
                        if(a[2][2]=='i'){
                            a[2][2] = 'O';
                            c2++;

                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                c++;
            }

            else {
                System.out.println("\n\nturn = X\n");
                String t=s.next();
                switch (t) {
                    case "a":
                        if(a[0][0]=='a'){
                            a[0][0] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "b":
                        if(a[0][1]=='b'){
                            a[0][1] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}

                        break;
                    case "c":
                        if(a[0][2]=='c'){
                            a[0][2] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "d":
                        if(a[1][0]=='d'){
                            a[1][0] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "e":

                        if(a[1][1]=='e'){
                            a[1][1] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "f":
                        if(a[1][2]=='f'){
                            a[1][2] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "g":
                        if(a[2][0]=='g'){
                            a[2][0] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "h":
                        if(a[2][1]=='h'){
                            a[2][1] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    case "i":

                        if(a[2][2]=='i'){
                            a[2][2] = 'X';
                            c2++;
                        }
                        else{
                            System.out.println("Error:place is already occupied");}
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                c++;
            }
            for ( i=0; i<3;i++){
                System.out.print("\n");//for print array
                for (int j=0;j<a[i].length;j++){
                    System.out.print(" | "+a[i][j]+" | ");

                }
            }
            if(a[0][0]=='O'&&a[0][1]=='O' && a[0][2]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }
            if(a[1][0]=='O'&&a[1][1]=='O' && a[1][2]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }
            if(a[2][0]=='O'&&a[2][1]=='O' && a[2][2]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }
            if(a[0][0]=='O'&&a[1][0]=='O' && a[2][0]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }
            if(a[0][1]=='O'&&a[1][1]=='O' && a[2][1]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }
            if(a[0][2]=='O'&&a[1][2]=='O' && a[2][2]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }
            if(a[0][0]=='O'&&a[1][1]=='O' && a[2][2]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }
            if(a[2][0]=='O'&&a[1][1]=='O' && a[0][2]=='O'){
                System.out.println("\n\nO is winner");
                break;
            }


            if(a[0][0]=='X'&&a[0][1]=='X' && a[0][2]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }
            if(a[1][0]=='X'&&a[1][1]=='X' && a[1][2]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }
            if(a[2][0]=='X'&&a[2][1]=='X' && a[2][2]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }
            if(a[0][0]=='X'&&a[1][0]=='X' && a[2][0]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }
            if(a[0][1]=='X'&&a[1][1]=='X' && a[2][1]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }
            if(a[0][2]=='X'&&a[1][2]=='X' && a[2][2]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }
            if(a[0][0]=='X'&&a[1][1]=='X' && a[2][2]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }
            if(a[2][0]=='X'&&a[1][1]=='X' && a[0][2]=='X'){
                System.out.println("\n\nX is winner");
                break;
            }

if (c2==9){
    System.out.println("\nTIE!!!");
    break;
}

        }


        }
    }

