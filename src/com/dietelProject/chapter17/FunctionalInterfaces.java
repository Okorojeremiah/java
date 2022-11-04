package com.dietelProject.chapter17;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //Consumer function
        Consumer<Integer> consumer = (i) -> System.out.println(i * 2);
        consumer.accept(60);

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.forEach(i -> System.out.println(i * 2));

        //Bi-consumer function
        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name+" "+age);
        biConsumer.accept("Rachel", 102);

        Map<String, Integer> mapOfPersons = Map.of(
                "Banke", 38,
                "Temi", 56,
                "Hadiza", 150
        );

        mapOfPersons.forEach((name, age) -> System.out.println(name+ " " + age));
        mapOfPersons.forEach(biConsumer);

        //Bi-predicate function
        BiPredicate<Integer, String> biPredicate = (number, word) -> word.length() == number;
        System.out.println(biPredicate.test(5, "Jerry"));

        //BinaryOperator
        BinaryOperator<Integer> binaryOperator = (num,number) -> num * number;
        System.out.println(binaryOperator.apply(90, 90));
    }
}
