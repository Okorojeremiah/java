package chapter16;

import java.util.*;

public class CreateMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        createsMap(map);
        displayMap(map);
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> key = map.keySet();

        TreeSet<String> sortedKey = new TreeSet<>(key);

        for (String keys : sortedKey){
            System.out.printf("%-18s %10d%n", keys, map.get(keys));
        }
        System.out.printf("%d %b", map.size(), map.isEmpty());
    }

    private static void createsMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence");
        String sentence = scanner.nextLine();

        String[] token = sentence.split(" ");

        for(String word : token){
            if (map.containsKey(word)){
                int value = map.get(word);
                map.put(word, value + 1);
            }else {
                map.put(word, 1);
            }
        }
    }
}
