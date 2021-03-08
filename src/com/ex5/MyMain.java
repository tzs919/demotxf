package com.ex5;

import java.util.*;

public class MyMain {
//generic programming
    //type parameter
    //generic class
    //generic method
//
//    public static int getMiddle(int[] a) {
//        return a[a.length / 2];
//    }//overload
    //override   refence
//
    public static <T> T getMiddle(T[] a) {
        return a[a.length / 2];
    }
//C++
    //template  C
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(getMiddle(a));

        Double[] b = {1.1, 1.2, 5.4, 69.9};
        System.out.println(getMiddle(b));

        Float[] c = {1.1f, 1.2f, 5.4f, 69.9f};
        System.out.println(getMiddle(c));


        Pair<String> pair = new Pair<>();

        ArrayList<String> list = new ArrayList<>();

        list.add("tao");
        list.add("zhao");
        list.add("sheng");

        Collections.sort(list);

        if(list.contains("zhao"))
        {
            System.out.println("found");
        }

        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
//sequence



//        BigDecimal d1 = new BigDecimal("0.000000000000000000313");
//        BigDecimal d2 = new BigDecimal("0.000000000000000002333");
//
//        System.out.println("=" + d1.round(d2).toPlainString());

    }
}
