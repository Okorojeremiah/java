package com.dietelProject.chapterSixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingObjectOfComparator {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(456);
        values.add(576);
        values.add(490);
        values.add(432);
        values.add(476);
        values.add(409);

//      Comparator<Integer> com =

        values.sort((o1, o2) -> o1 % 100 > o2 % 100 ? 1 : -1);

        values.forEach(System.out::println);

    }


}
