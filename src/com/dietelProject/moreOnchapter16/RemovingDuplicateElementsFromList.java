package chapter16;

import java.util.*;

public class RemovingDuplicateElementsFromList {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);

        printLists(list);
    }

    private static void printLists(Collection<String> list) {
        Set<String> newSet = new HashSet<>(list);

        for (String color : newSet){
            System.out.printf("%s ", color);
        }
    }
}
