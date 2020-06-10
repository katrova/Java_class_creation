package com.company;

/*
 * Classname : Main
 *
 * 7 June 2020
 *
 * Copyright Vasylkivska Kateryna KNTEU
 *
 * Module 2 task 1
 *
 * 1. Constructor.
   2. Getters/Setters.
   3. 5 methods.
   4. Override toString() method
   5. Override hash() and equals() methods.
   *
   *  * 15. Rectangular triangle.
 */
import java.util.Objects;

public class RectangularTriangle {
    private double sideA;
    private double sideB;

    /**
     * Class constructor with parameters
     * @param  sideA side that wiil be set to rectangular triangle
     * @param sideB side that wiil be set to rectangular triangle
     */
//____________________________________________________________

    // 1. Constructor
    // Full constructor
    public RectangularTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Empty constructor
    public RectangularTriangle() {
    }
    //____________________________________________________________

    // 2. Getters/Setters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    //____________________________________________________________

   // 3. 5 methods.
    public double getHypotenuse(){
        return Math.sqrt(this.getSideA()*this.getSideA() + this.getSideB()*this.getSideB());

    }

    public double getPerimeter(){
      return  this.getSideA() + this.getSideB() + this.getHypotenuse();
    }

    public double getArea(){
        return 0.5 * this.getSideA() * this.getSideB();
    }

    public double getHeight(){
        return this.getSideA() * this.getSideB() / this.getHypotenuse();
    }

    public boolean isTriangle(){
        return (this.getSideA()>0 && this.getSideB()>0);
    }
    //____________________________________________________________

    //4. Override toString() method
    @Override
    public String toString() {
        return "RectangularTriangle{" +
                "sideA=" + sideA +
                ",\n sideB=" + sideB +
                ",\n Hypotenuse=" + this.getHypotenuse() +
                ",\n Perimeter=" + this.getPerimeter() +
                ",\n Area=" + this.getArea() +
                ",\n Height=" + this.getHeight() +
                ",\n Triangle=" + this.isTriangle() +
                '}';
    }
    //____________________________________________________________

    //5. Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularTriangle that = (RectangularTriangle) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 &&
                Double.compare(that.getSideB(), getSideB()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB());
    }
}