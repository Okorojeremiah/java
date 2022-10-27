package com.dietelProject.oop;

public class Complex {

    private final double realPart;
    private final double imaginaryPart;

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex(){
        this(0.0,0.0);
    }

    public static Complex addComplexNumbers(Complex complex, Complex complex1){
        double sumRealPart = complex.realPart + complex1.realPart;
        double sumImaginaryPart  = complex.imaginaryPart + complex1.imaginaryPart;
        return new Complex(sumRealPart, sumImaginaryPart);
    }

    public static Complex subtractComplexNumber(Complex complex, Complex complex1){
        double sumRealPart = complex1.realPart - complex.realPart;
        double sumImaginaryPart  = complex1.imaginaryPart - complex.imaginaryPart;
        return new Complex(sumRealPart, sumImaginaryPart);
    }

    @Override
    public String toString() {
        return "(" +
                realPart +
                ", " + imaginaryPart +
                ')';
    }
}
