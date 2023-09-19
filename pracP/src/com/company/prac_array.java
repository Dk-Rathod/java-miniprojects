package com.company;
import java.util.Scanner;
import java.util.Arrays;
class array{
    public static  int[] swap(int[]arr,int a,int b){
      int temp = arr[a];
      arr[a]=arr[b];
      arr[b]=temp;

      return arr;
    }

}
public class prac_array {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int []a= new int[5];
        int f=0;
        for (int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }

        System.out.println("enter number for search :");
        int num = s.nextInt();

        for (int i=0;i<a.length;i++){
            if (num==a[i]){
                System.out.println("element found at "+i+"th index");
                f=1;
                break;

            }
        }
        if (f==0){
            System.out.println("element not found");
        }




        }
    }




  /* PRAC 1
        float[] a = new float[5];
        float sum =0;

        for (int i = 0; i < 5;i++ ) {
            a[i] = s.nextFloat();
            sum = sum + a[i];

        }
       // for(int j = 0; j<5;j++) {

        //}
        System.out.println("sum = "+sum);

        PRAC  2

        int []a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int b = 0;
        int n = s.nextInt();
        for(int i = 0;i<a.length;i++) {
            if(a[i]==n) {
                System.out.println("number is present on array");
                b = 1;
            }
        }
        if(b==0) {
            System.out.println("number not in array");
        }
    }


        int []m = new int[5];
        int sum =0;
        for(int i = 0;i<5;i++) {
            m[i] = s.nextInt();
            sum = sum + m[i];
        }
        int avg = sum/m.length;

        for(int j=0;j<5;j++) {
            System.out.println(m[j]);
        }
        System.out.println("avg::: "+avg);


        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }


         */




