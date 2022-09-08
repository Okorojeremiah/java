package com.dietelProject.chapterTen.duckClass;

public class Duck{

    private Quackable quackable;
    private Flyable flyable;

    public Duck(Quackable quackable){
        this.quackable = quackable;
    }

    public void quack(){
        quackable.quack();
    }

    public void display(){
        System.out.println("displaying");
    }

    public void fly(){
        System.out.println("fly");
    }



}
