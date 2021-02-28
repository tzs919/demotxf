package com.example2;

import java.lang.Math;

//Example (In Main.java): PrimeFactorization.factorize(90);

public class PrimeFactorization {

    public static void main(String[] args) {
        Factorize(499*499*499);
    }

    private static int minPrime(int num) {
        int x = (int) Math.sqrt(num);
        for (int i = 2; i <= x; i++) {
            if (num % i == 0)
                return i;
        }
        return num;
    }

    public static void Factorize(int number) {
        int x = minPrime(number);
        if (x != 1) {
            System.out.print(x);
            number /= x;
            x = minPrime(number);
        }
        while (x != 1) {
            System.out.print(" * " + x);
            number /= x;//1
            x = minPrime(number);
        }
        System.out.println();
    }
}
