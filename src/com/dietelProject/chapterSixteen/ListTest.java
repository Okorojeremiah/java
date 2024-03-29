package com.dietelProject.chapterSixteen;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list = new LinkedList<>();

        for (String color :
             colors) {
            list.add(color);
        }

        String[] color2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for (String color:
             color2) {
            list2.add(color);
        }

        list.addAll(list2);
        list2 = null;
        printList(list);

        convertToUppercaseStrings(list);
        printList(list);

        System.out.printf("%nDeleting elements 4 to 6....");
        removeItems(list, 4, 7);
        printList(list);
        printReversedList(list);
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        while(iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }

    private static void removeItems(List<String> list, int i, int i1) {
        list.subList(i, i1).clear();
    }

    private static void printList(List<String> list) {
        for(String color: list){
            System.out.printf("%s ", color);
        }
        System.out.println();
    }
}
