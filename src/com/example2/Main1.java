package com.example2;

public class Main1 {
    private static int count = 0;

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("====" + arg);
        }
//source code //compile ==>byte code
    }

    private static void decompose(int n) {
        if (n <= 1) {
            System.out.println("error: bad int，must >1");
        } else {
            System.out.print(n + "=");
        }

        for (int i = 2; i < n + 1; i++) {
            count++;
            while (n % i == 0 && n != i) {
                count++;
                n /= i;
                System.out.print(i + "*");
            }

            if (n == i) {
                System.out.println(i);
                break;
            }
        }
    }
}