package com.dietelProject.chapterSixteen;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        createMap(map);
        displayMap(map);
    }

    public static void createMap(Map<String,Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a sentence: ");
        String word = scanner.nextLine();

        String[] split = word.split(" ");

        for (String s : split){
            if(map.containsKey(s)){
                int count = map.get(s);
                map.put(s, count + 1);
            }else {
                map.put(s, 1);
            }
        }
    }

    public static void displayMap(Map<String,Integer> map){
        Set<String> set = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(set);

        System.out.printf("%nMap contains:%nKey\t\t\t\tValue%n");

        for (String s : sortedKeys){
            System.out.printf("%-10s%10s%n", s, map.get(s));
        }

    }
}
