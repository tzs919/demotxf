package com.ex4;

public class MonkeysAndPeaches {
    public static void main(String[] args) {
        int monkeyNumber = 5;
        int peachNumber = minPeachNumber(monkeyNumber);

        takePeachesView(peachNumber, monkeyNumber);

        if (MinPeachNumberCheck(monkeyNumber) == peachNumber)
            System.out.println("Examination Passed；");
        System.out.println(MinPeachNumberCheck(monkeyNumber));
    }

    public static int minPeachNumber(int monkeyNumber) {
        if (monkeyNumber == 1)
            return 6;

        int peachNumber = minPeachNumber(monkeyNumber - 1);

        int addValue = (int) Math.pow(5, monkeyNumber - 1);
        while (peachNumber % 4 != 0) {
            peachNumber += addValue;
        }

        return peachNumber / 4 * 5 + 1;
    }

    public static void takePeachesView(int peachNumber, int monkeyNumber) {

        int peachNumberCopy = peachNumber;

        System.out.println("There are " + peachNumberCopy + ";");

        for (int i = 0; i < monkeyNumber; i++) {
            peachNumberCopy -= (peachNumberCopy - 1) / 5;
            System.out.println("#" + (i + 1) + " monkey took " + (peachNumberCopy - 1) / 5 + " peaches;\t" + peachNumberCopy + " left;");
        }
    }

    public static double MinPeachNumberCheck(int monkeyNumber) {
        int restPeachNumber = 2;
        double minPeachNumber;

        do {
            minPeachNumber = restPeachNumber;

            for (int j = 0; j < monkeyNumber; j++) {
                minPeachNumber = minPeachNumber / 4 * 5 + 1;
            }

            restPeachNumber++;
        } while (Math.round(minPeachNumber) != minPeachNumber);

        return minPeachNumber;
    }


}
