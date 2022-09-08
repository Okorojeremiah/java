package com.dietelProject.oop;

public class ConstructorChaining {
    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining();
    }

    // Default constructor
    public ConstructorChaining(){
        this("This is constructor chaining");
        System.out.println("No args constructor called");
    }

    //Parameterized constructor
    public ConstructorChaining(String text) {
        System.out.println("Parameterized constructor called");

    }

    static class ConstructorChaining2 extends ConstructorChaining{
        public static void main(String[] args) {
            ConstructorChaining2 constructorChaining2 = new ConstructorChaining2();
        }
        public ConstructorChaining2(){
//            this("bdsndjljdf", "gfghgkgj");
//            super();
            System.out.println("Derived no args constructor called");
        }

//        public ConstructorChaining2(String text1, String text){
//            //Invoking the constructor of a super class
////            super();
//            System.out.println("Derived class parameterized constructor called");
//        }
    }
}
