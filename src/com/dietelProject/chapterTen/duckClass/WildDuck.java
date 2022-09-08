package com.dietelProject.chapterTen.duckClass;

public class WildDuck extends Duck{

    public WildDuck(Quackable quackable) {
        super(quackable);
    }

    @Override
    public void quack(){
        System.out.println("quack2");
    }

    @Override
    public void display(){
        System.out.println("display2");
    }

    @Override
    public void fly(){
        System.out.println("fly2");
    }
}
