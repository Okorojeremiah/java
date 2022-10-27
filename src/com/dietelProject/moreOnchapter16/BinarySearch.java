package com.dietelProject.moreOnchapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        String[] colors = {"Black", "Blue", "White", "Purple", "Magenta"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list);
        System.out.printf("%s %s%n","Sorting the list", list);

        printSearchResult(list, "Black");
        printSearchResult(list, "Blue");
        printSearchResult(list, "White");
        printSearchResult(list, "Purple");
        printSearchResult(list, "Magenta");
    }

    private static void printSearchResult(List<String> list, String key) {
        int result = Collections.binarySearch(list, key);
        System.out.println("Searching for "+ key);

        if (result >= 0){
            System.out.println("Found at position "+ result);
        }else{
            System.out.println("Not found "+ result);
        }
    }
}
