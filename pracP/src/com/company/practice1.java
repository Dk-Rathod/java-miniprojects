package com.company;

class shape {
    int s;
    public void length() {
        int l;
        System.out.println("length");
    }
}
class rectangle extends shape {
    shape s1 = new shape();


}
public class practice1 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.s=34;
        System.out.println(r1.s);
    }
}
