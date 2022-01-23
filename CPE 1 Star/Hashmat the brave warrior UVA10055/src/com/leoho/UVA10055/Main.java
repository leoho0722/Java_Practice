package com.leoho.UVA10055;
// Hashmat the brave warrior UVA10055

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong(), b = scanner.nextLong();
        System.out.println("答案：" + Math.abs(a - b));
    }
}
