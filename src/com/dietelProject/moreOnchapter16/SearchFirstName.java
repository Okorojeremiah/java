package chapter16;

import java.util.*;

public class SearchFirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s%n", "Enter your first name or No to end");
        String firstName = scanner.nextLine();
        String stop = " ";

        List<String> list = new ArrayList<>();
        list.add(firstName);

        while(stop.equalsIgnoreCase("No")){
            System.out.printf("%s%n", "Enter your first name or -1 to end");
            firstName = scanner.nextLine();
            list.add(firstName);
        }

        printNonDuplicateList(list);

        System.out.printf("%s", "Enter a name to search");
        String foundName = scanner.nextLine();
        searchFirstName(list, foundName);
    }

    private static void searchFirstName(List<String> list, String foundName) {
        if (list.contains(foundName)){
            System.out.printf("%s", foundName);
        }
    }

    private static void printNonDuplicateList(List<String> list) {
        Set<String> set = new TreeSet<>(list);

        for (String name : set){
            System.out.printf("%s ", name);
        }
    }
}
