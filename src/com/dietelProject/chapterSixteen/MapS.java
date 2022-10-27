package com.dietelProject.chapterSixteen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapS {
    public static void main(String[] args) {

        Map<String,String> maps = new HashMap<>();

        maps.put("myName", "Jerry");
        maps.put("myJob", "Software-Engineer");
        maps.put("myVillage", "Umuaro");

        Set<String> set = maps.keySet();

        for (String s : set) {
            System.out.println(s+ " "+ maps.get(s));
        }
    }
}
