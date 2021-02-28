package com.example2;

import com.tao.Teacher;

import java.util.Scanner;

class Main2 {
    private static int count = 0;

    public static void main(String[] args) {


        System.out.println("please input an int: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factor = 2;

        System.out.print(num + " = ");

        String star = "";
        while (factor <= (num)) {
            if (num % factor == 0) {
                System.out.print(star + factor);
                star = "*";
                num /= factor;
            } else {
                factor = nextPrime(factor);
            }
        }

        System.out.print("\n");
        System.out.println("count=" + count);
    }

    static boolean isPrime(int n) {
        int factor = 2;
        int lim = (int) Math.sqrt((double) n);
        for (factor = 3; factor <= lim; factor += 2) {
            count++;
            if (n % factor == 0) {
                return false;
            }
        }
        return true;
    }

    static int nextPrime(int n) {
        if (n == 2) {
            return 3;
        }
        n += 2;
        while (!isPrime(n)) {
            n += 2;
        }
        return n;
    }

}
