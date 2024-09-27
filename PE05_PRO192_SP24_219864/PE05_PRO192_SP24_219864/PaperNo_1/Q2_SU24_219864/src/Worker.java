/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public abstract class Worker {

    protected String name;
    protected int age;
    protected int numOfChild;

    public Worker() {
    }

    public Worker(String name, int age, int numOfChild) {
        this.name = name;
        this.age = age;
        this.numOfChild = numOfChild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfChild() {
        return numOfChild;
    }

    public void setNumOfChild(int numOfChild) {
        this.numOfChild = numOfChild;
    }

    public abstract double getGrossIncome();

    public abstract double getTax(double salary);
}
