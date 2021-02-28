package com.example2;

public class PrimeFactorization2 {

    private static final int MIN_PRIME = 2;//常量constant

    public static void main(String[] args) {
        factorize(499*499*499);
    }

    private static int minPrimeFactor(int number) {
        int squareRoot = (int) Math.sqrt(number);
        for (int factor = MIN_PRIME; factor <= squareRoot; factor++) {
            if (number % factor == 0)
                return factor;
        }
        return number;
    }

    public static void factorize(int number) {
        if (number < MIN_PRIME) {
            System.out.println("error: number is bad int");
            return;
        }

        System.out.print(number + " = ");

        int restOfNumber = number;

        while (restOfNumber != 1) {
            int minFactor = minPrimeFactor(restOfNumber);
            while ((restOfNumber % minFactor) == 0) {
                System.out.print(minFactor);
                restOfNumber = restOfNumber / minFactor;
                if (restOfNumber != 1) {
                    System.out.print(" * ");
                }
            }
        }

        System.out.print("\n");
    }
}
