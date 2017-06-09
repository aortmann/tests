package com.aortmann;

import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<String> c = Arrays.asList("mesa", "silla", "nota", "pera", "cinco", "hola", "la", "guitarra");
        System.out.println(new GroupBy().groupBy(c, x -> x.length()));

        Collection<Integer> d = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
        System.out.println(new GroupBy().groupBy(d, x -> x%5));
    }
}