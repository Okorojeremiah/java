package com.dietelProject.chapterSixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionContd {
    public static void main(String[] args) {
        List<Students> studs = new ArrayList<>();

        studs.add(new Students(1, 54));
        studs.add(new Students(2, 67));
        studs.add(new Students(3, 56));
        studs.add(new Students(4, 45));
        studs.add(new Students(5, 70));
        studs.add(new Students(6, 76));
        studs.add(new Students(7, 98));

        studs.sort((o1, o2) -> Integer.compare(o2.marks, o1.marks));

        studs.forEach(System.out::println);

    }

}

class Students{
    int rollNo;
    int marks;

    public Students(int rollNo, int marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
