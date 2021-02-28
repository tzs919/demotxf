package com.ex4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        int[] ages = {1, 2, 4, 5, 10, 9, 7, 6, 10};
//        ages[5]=88;
//        Arrays.sort(ages);
         ArrayList<String>  aa;  //generic type
//        System.out.println(Arrays.toString(ages));

//        String[][] arr1 = {{"aaa", "bbb"}, {"ccc"}};

//
//        //Arrays.deepToString 快速打印一个二维数组的数据元素列表
//        System.out.println(Arrays.deepToString(arr));
//
//        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(nums));
//
//        int[] num = {1, 3, 8, 5, 2, 4, 6, 7};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));//[1, 2, 3, 4, 5, 6, 7, 8]
//        System.out.println(Arrays.binarySearch(num, 2));//返回元素的下标 1
//
        int[][] num1 = {{1, 2}, {2, 3}, {34, 3}};
        int[][] num2 = new int[3][2];
        System.arraycopy(num1, 0, num2, 0, num1.length);
//        System.out.println(Arrays.toString(num2));//[1, 2, 3]

        num2[0] = new int[]{1, 2};
//
        System.out.println(Arrays.equals(num1, num2));
//
        int[] num5 = {1, 2, 3, 4, 5, 6, 7};
        Arrays.fill(num5, 2, 5, 0);
        System.out.println(Arrays.toString(num5));
    }

}
