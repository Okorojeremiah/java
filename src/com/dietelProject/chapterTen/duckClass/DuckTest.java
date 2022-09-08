package com.dietelProject.chapterTen.duckClass;

public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new Duck(new SimpleQuack());
        duck.quack();
    }
}
