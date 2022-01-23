package com.leoho.UVA10041;
// Vito's family UVA10041

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("輸入的測資數量：");
        int testCase = scanner.nextInt(); // 輸入測資的數量
        System.out.println("輸入的測資數量：" + testCase);
        while ((--testCase) >= 0) {
            System.out.print("輸入每筆測資的資料數量：");
            int size = scanner.nextInt(); // 輸入每筆測資的資料數量
            System.out.println("輸入每筆測資的資料數量：" + size);
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("該筆測資的資料：");
                array[i] = scanner.nextInt();
                System.out.println("該筆測資的資料：" + array[i]);
            }
            Arrays.sort(array); // 將資料進行排序
            int len = 0;
            for (int i = 0; i < size; i++) {
                len += Math.abs(array[i]-array[i/2]); // 找出中位數，並加總起來
            }
            System.out.println("答案：" + len);
        }
    }
}
