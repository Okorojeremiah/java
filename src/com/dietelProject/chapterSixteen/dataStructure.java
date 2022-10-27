package com.dietelProject.chapterSixteen;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class dataStructure {
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Blue");
        colors.add("Black");

        Map<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("from queue "+ colors);
        System.out.println("from map "+ map);
    }


}
