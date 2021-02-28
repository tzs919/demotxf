package com.ex3;

class Main {
    public static void main(String[] args) {
        int result = num(2);
        System.out.println("result is " + result);
    }

    public static int num(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        int index = 2;
        while (n > 1) {
            for (int i = index + 1; i < n; i++) {
                array[i - 1] = array[i];
            }
            n--;
            index += 2;

            if (index >= n) {
                index -= n;
            }
        }
        return array[0];
    }
}
