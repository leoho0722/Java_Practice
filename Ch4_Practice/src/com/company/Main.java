package com.company;

public class Main {

    public static void main(String[] args) {
        hw4_1_1a();
        hw4_1_1b();
        hw4_1_1c();
        hw4_1_3();
    }

    public static void hw4_1_1a() {
        System.out.println("---------hw4.1.1.a----------");
        int a = 8;
        System.out.println("a = " + (++a));
        System.out.println("a = " + (a--));
    }

    public static void hw4_1_1b() {
        System.out.println("---------hw4.1.1.b----------");
        int a = 10, b = 20;
        a %= 5;
        b /= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void hw4_1_1c() {
        System.out.println("---------hw4.1.1.c----------");
        int a = 20, b = 5;
        a %= b;
        b *= 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void hw4_1_3() {
        System.out.println("---------hw4.1.3----------");
        System.out.println('a' < 28);
        System.out.println(4+3 == 8-1);
        System.out.println(8 > 2);
        System.out.println('a' != 97);
    }
}
