package com.dietelProject.moreOnchapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingAFileAndSavingInAnArrayList {
    public static void main(String[] args) throws IOException {
        List<String> array = readStrings();
        List<String> filtered = array.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        for (String s : filtered) {
            System.out.println(s);
        }
    }

    private static List<String> readStrings() throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("newmast.txt"))) {
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
    }
}
