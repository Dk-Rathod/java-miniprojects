package com.company;
import java.util.Scanner;
public class bgfm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter first player name::");
        String p1 = s.nextLine();

        System.out.println("enter sec player name::");
        String p2 = s.nextLine();

        System.out.println("enter thr player name::");
        String p3 = s.nextLine();

        System.out.println("give fund to "+p1);
        int a = s.nextInt();

        System.out.println("give fund to "+p2);
        int b = s.nextInt();

        System.out.println("give fund to "+p3);
        int c = s.nextInt();

        System.out.println("give fund to bank");
        int bank = s.nextInt();

        System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

        for(int i = 1;i>0;i++) {


            System.out.println("enter amount :- ");
        int t = s.nextInt();
            System.out.println("enter transaction code :");
        int ca =s.nextInt();
            System.out.println("\n");
        switch (ca) {
            case 12:
                a = a - t;
                b = b + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p1+" to "+p2);
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;

            case 13:

                a = a - t;
                c = c + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p1+" to "+p3);
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;

            case 10:
                a = a - t;
                bank = bank + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p1+" to bank");
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;
            case 21:
                b = b - t;
                a = a + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p2+" to "+p1);
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;
            case 23:
                b = b - t;
                c = c + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p2+" to "+p3);
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;
            case 20:
                b = b - t;
                bank = bank + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p2+" to bank");
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;
            case 31:
                c = c - t;
                a = a + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p3+" to "+p1);
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;
            case 32:
                c = c - t;
                b = b + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p3+" to "+p2);
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;
            case 30:
                c = c - t;
                bank = bank + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from "+p3+" to bank");
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;

            case 01:
                bank = bank - t;
                a = a + t;
                System.out.println("transaction successful   of  "+t+ "Rs   from  bank to "+p1);
                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;
                case 02:
                bank = bank - t;
                b = b + t;
                    System.out.println("transaction successful   of  "+t+ "Rs   from  bank to "+p2);
                    System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                    break;
                case 03:
                bank = bank - t;
                c = c + t;
                    System.out.println("transaction successful   of  "+t+ "Rs   from  bank to "+p3);
                    System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                    break;
            case 00:

                System.out.println("\n---------------\n0 - bank --> "+bank+" Rs\n"+"1 - "+p1+" --> "+a+" Rs\n"+"2 - "+p2+" --> "+b+" Rs\n"+"3 - "+p3+" --> "+c+" Rs\n---------------\n");

                break;

        }
        }


    }
}
