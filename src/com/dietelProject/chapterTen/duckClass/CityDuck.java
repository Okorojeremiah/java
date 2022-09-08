package com.dietelProject.chapterTen.duckClass;

public class CityDuck extends Duck{

    public CityDuck(Quackable quackable) {
        super(quackable);
    }

    @Override
    public void quack(){
        System.out.println("quack1");
    }

    @Override
    public void display(){
        System.out.println("display1");
    }

    @Override
    public void fly(){
        System.out.println("fly1");
    }
}
