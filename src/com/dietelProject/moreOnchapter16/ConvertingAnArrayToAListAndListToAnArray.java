package com.dietelProject.moreOnchapter16;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertingAnArrayToAListAndListToAnArray {
    public static void main(String[] args) {
        String[] array = {"Egg", "Rice", "Bread", "Yam"};

        LinkedList<String> links = new LinkedList<>(Arrays.asList(array));
        links.add("Eba");
        links.addLast("Egusi");
        links.addFirst("Fufu");
        links.add(3, "Amala");

        array = links.toArray(new String[links.size()]);

        for (String food : array) {
            System.out.print(food + " ");
        }


    }
}
