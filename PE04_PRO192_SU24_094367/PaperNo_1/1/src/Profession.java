/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Profession {
    private String name;
    private int age;
    private String major;

    public Profession() {
        this.name = "Nguyen Van A";
        this.age = 20;
        this.major = "Student";
    }

    public Profession(String name, int age, String major) {
        this.name = name;
        if (age < 20){
            this.age = 20;
        }
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("n/a")){
            this.name = "No name";
        }
        else{
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + major;
    }
    
}
