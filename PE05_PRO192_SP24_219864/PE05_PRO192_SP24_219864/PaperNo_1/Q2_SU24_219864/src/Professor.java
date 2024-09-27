/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Professor extends Worker{
    private int tenure;

    public Professor() {
    }

    public Professor(int tenure,  int numOfChild, String name, int age) {
        super(name, age, numOfChild);
        this.tenure = tenure;
    }

    @Override
    public double getGrossIncome() {
        double gross = 0;
        if (tenure >= 1 && tenure < 3){
            gross = 3000;
        }else if (tenure > 3){
            gross = 5000;
        }
        return gross;
    }

    @Override
    public double getTax(double salary) {
        double finalTax = 0;
        double taxIncome = salary - numOfChild*900;
        if (taxIncome < 0){
            finalTax = 0;
        }else if (taxIncome <= 1000){
            finalTax = 0.1 * taxIncome;
        }else if (taxIncome > 1000){
            finalTax = 0.2 * taxIncome;
        }
        return finalTax;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + numOfChild + ", " + tenure;
    }
    
}
