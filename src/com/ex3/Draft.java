package com.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Draft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of people in a circle:");
        int numberOfPeople = scanner.nextInt();
        int[] kickSequence = kick(numberOfPeople);
        kickingViewer(numberOfPeople, kickSequence);
    }

    public static int[] kick(int numberOfPeople) {
        boolean[] people = new boolean[numberOfPeople];
        Arrays.fill(people, false);

        int[] kickSequence = new int[numberOfPeople - 1];

        int pointer = 0;
        int flag = 0;
        int outNumber = 0;

        while (outNumber < numberOfPeople - 1) {
            if (!people[pointer]) {
                flag++;
                if (flag % 3 == 0) {
                    people[pointer] = true;
                    kickSequence[outNumber] = pointer;
                    outNumber++;
                }
            }
            pointer++;
            pointer %= numberOfPeople;
        }

        for (int i = 0; i < numberOfPeople; i++) {
            if (!people[i]) {
                System.out.println(i + 1 + " is the last one;\n");
                break;
            }
        }

        return kickSequence;
    }

    public static int digitsOf(int number) {
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number != 0);

        return count;
    }

    public static void printArray(int length, int[] numbers) {
        for (int i = 0; i < length; i++) {
            if (numbers[i] == -1) {
                for (int j = 0; j < digitsOf(i + 1); j++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    public static void kickingViewer(int numberOfPeople, int[] kickSequence) {
        int[] numbers = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            numbers[i] = i + 1;
        }

        printArray(numberOfPeople, numbers);
        for (int i = 0; i < numberOfPeople - 1; i++) {
            numbers[kickSequence[i]] = -1;
            if (i == numberOfPeople - 2 || kickSequence[i + 1] < kickSequence[i])
                printArray(numberOfPeople, numbers);
        }
    }
}
