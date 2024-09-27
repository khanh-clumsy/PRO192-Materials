/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getNameLength() {
        return name.length();
    }

    public double getNetSalary() {
        return salary * 0.9;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salary);
    }

}
