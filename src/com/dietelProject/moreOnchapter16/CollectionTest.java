package com.dietelProject.moreOnchapter16;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"M", "R", "B", "B", "G"};
        List<String> list = Arrays.asList(colors);


        Collections.reverse(list);
        output(list);

        String[] copyColors = new String[5];
        List<String> list2 = Arrays.asList(copyColors);

        Collections.copy(list2, list);
        output(list2);

        Collections.fill(list, "Y");
        output(list);



//        for (String color : colors){
//            list.add(color);
//        }
//
//        String[] removeColors = {"Magenta", "Red", "Green"};
//        List<String> removeList = new ArrayList<>();
//
//        for (String color : removeColors){
//            removeList.add(color);
//        }
//
//
//
//        remover(list, removeList);


    }

//    private static void remover(Collection<String> list, Collection<String> removeList) {
//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            if (removeList.contains(iterator.next()))
//                iterator.remove();
//        }
//    }

    private static void output(List<String> list){
        for (String l : list){
            System.out.print(l + " ");
        }

        System.out.printf("%nMax: %s", Collections.max(list));
        System.out.printf(" Min: %s%n", Collections.min(list));
    }
}
