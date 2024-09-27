/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Student {

    private String rollNo;
    private String name;
    private float gpa;

    public Student() {
    }

    public Student(String rollNo, String name, float gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%.2f", rollNo.toUpperCase(), name, gpa);
    }

}
