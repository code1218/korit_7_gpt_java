package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main4 {


    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2 = null;
        List<String> numberList3 = null;


        numberList2 = new ArrayList<>();
        for (Integer number : numberList) {
            numberList2.add(number * 10);
        }

        numberList3 = numberList.stream()
                .map(number -> number * 10 + "")
                .collect(Collectors.toList());

        AtomicReference<Integer> num = new AtomicReference<>(0);

        final List<Integer> numberList4 = new ArrayList<>();

        numberList.forEach(number -> {
            numberList4.add(number);
            num.set(number);
        });

        System.out.println(numberList);
        System.out.println(numberList2);
        System.out.println(numberList3);
    }
}
