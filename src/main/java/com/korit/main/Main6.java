package com.korit.main;

import com.korit.entity.User;
import com.korit.entity.UserDto;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

@AllArgsConstructor
class Authority<T> implements Supplier<T> {
    private T role;

    @Override
    public T get() {
        return role;
    }
}

public class Main6 {

    public static void main(String[] args) {
        // Thread(Main 메소드의 역할)
        Runnable runnable;
        // 매개변수로 값을 받아서 해당 값을 처리, 처리한 결과를 return해주지는 않음
        Consumer<String> consumer;
        // 매개변수로 값을 받지 않고 처리한 데이터를 return해주는 역할
        Supplier<String> supplier;
        Authority<String> authority = new Authority<>("ROLE_ADMIN");
        String role = authority.get();

        // 매개변수로 값을 받아서 처리한 데이터를 return해주는 역할
        Function<String, String> function;
        Function<Integer, Integer> addFunction = num -> num + 10;
        Integer result = addFunction.apply(100);

        Predicate<String> predicate;
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNums = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        BiConsumer<Integer, String> biConsumer;
        Map<String, Object> userMap = Map.of("username", "admin", "password", "1234");
        /**
         * {
         *      "username": "admin",      Map에서 한 쌍 entry
         *      "password": "1234"
         * }
         */
        Set<Map.Entry<String, Object>> entries = userMap.entrySet();
        for(Map.Entry<String, Object> entry : entries) {
            entry.getKey();
            entry.getValue();
        }
        userMap.forEach((key, value) -> {
            System.out.println("key: " + key + " value: " + value);
        });

        BiFunction<Integer, Integer, String> biFunction;
        BiFunction<Integer, Integer, Integer> addBiFunction = (num1, num2) -> num1 + num2;
        Integer result2 = addBiFunction.apply(100, 200);

        BiPredicate<Integer, Integer> biPredicate;
        UnaryOperator<Integer> unaryOperator;
        BinaryOperator<Double> binaryOperator;

    }
}
