package com.dietelProject.chapterSixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(7);
        values.add(77);
        values.add(75);
        values.add(76);
        values.add(78);

        Collections.sort(values);

        values.forEach(System.out::println);

    }
}
