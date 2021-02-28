package com.ex3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        int peopleCount = scanner.nextInt();
        boolean[] isStay = new boolean[peopleCount];
        for (int i = 0; i < isStay.length; i++) {
            isStay[i] = true;
        } //数组赋值都是true

        int stayCount = peopleCount;
        int iterationCount = 0;
        int index = 0;
        while (stayCount > 1) {
            if (isStay[index] == true) {
                iterationCount++;
                if (iterationCount == 3) {
                    iterationCount = 0;
                    isStay[index] = false;
                    stayCount--;
                }
            }
            index++;
            if (index == peopleCount) {
                index = 0;
            }
        }

        for (int i = 0; i < peopleCount; i++) {
            if (isStay[i] == true) {
                System.out.println("原排在第" + (i + 1) + "位的人留下了。");
            }
        }
    }
}