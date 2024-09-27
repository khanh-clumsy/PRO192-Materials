/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(String color,double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isValidData(){
        return a < b + c &&  b < a + c && c < a + b;
    }

    @Override
    public double calArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calPerimeter() {
        if (isValidData()){
            return a + b + c;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f,%.2f,%.2f", color, a, b, c);
    }
    
}
