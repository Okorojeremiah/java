package com.dietelProject.chapterSixteen;

import java.util.*;

public class MapEntryInterface {
    public static void main(String[] args) {
        Map<String,String> maps = new TreeMap<>();

        maps.put("Jerry","08101558612");
        maps.put("Chuks","07036537905");
        maps.put("Ifeanyi","08038325071");
        maps.put("Ike","0813434789");

        Set<Map.Entry<String,String>> sets = maps.entrySet();

        for (Map.Entry<String,String> m : sets) {
            System.out.println(m.getKey()+ " "+ m.getValue());
        }

    }
}
