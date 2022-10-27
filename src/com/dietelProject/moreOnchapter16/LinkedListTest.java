package chapter16;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        String[] fruits = {"Mango", "Grape", "Berry", "Pawpaw", "Cashew", "Bread fruit"};
        List<String> linked = new LinkedList<>();

        for (String fruit : fruits){
            linked.add(fruit);
        }

        String[] fruits2 = {"Oranges", "Pineapple", "Apple", "Grape", "watermelon", "Pawpaw"};
        List<String> linked2 = new LinkedList<>();

        for(String fruit : fruits2){
            linked2.add(fruit);
        }

        linked.addAll(linked2);
        linked2 = null;
        printList(linked);

        convertToUpperCase(linked);
        printList(linked);

        System.out.printf("%n%s", "Removing items from 4--6 ");
        removeList(linked, 4, 6);
        printList(linked);

        printReverseList(linked);
    }

    private static void printList(List<String> link) {
        for (String fruit : link){
            System.out.printf("%s ", fruit);
        }
        System.out.println();
    }

    private static void convertToUpperCase(List<String> link) {
        ListIterator<String> iterator = link.listIterator();

        while(iterator.hasNext()){
            String iterate = iterator.next();
            iterator.set(iterate.toUpperCase());
        }
    }

    private static void removeList(List<String> link, int i, int i1) {
        link.subList(i, i1).clear();
    }

    private static void printReverseList(List<String> link) {
        ListIterator<String> iterator = link.listIterator(link.size());
        System.out.printf("%n%s%n", "Reversed list");

        while(iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }
}
