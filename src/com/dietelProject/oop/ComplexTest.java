package com.dietelProject.oop;

public class ComplexTest {
    public static void main(String[] args) {
        Complex complex = new Complex(0.34, 0.566);
        Complex complex1 = new Complex(0.145, 0.094);


        Complex complex2 = Complex.addComplexNumbers(complex, complex1);
        Complex complex3 = Complex.subtractComplexNumber(complex,complex2);
        System.out.println(complex2);
        System.out.println(complex3);

    }
}
