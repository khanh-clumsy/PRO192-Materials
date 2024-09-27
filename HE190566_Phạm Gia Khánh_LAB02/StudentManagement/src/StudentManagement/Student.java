/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Student {

    private String name;
    private String studentID;
    private Date birthDate;
    private String address;
    private String major;
    private Grade grade;

    public Student() {
    }

    public Student(String name, String studentID, Date birthDate, String address, String major, Grade grade) {
        this.name = name;
        this.studentID = studentID;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public Grade getGrade() {
        return grade;
    }

    public class Grade{

        private double PRO192;
        private double PRF192;
        private double CSD201;

        public Grade(double PRO192, double PRF192, double CSD201) {
            this.PRO192 = PRO192;
            this.PRF192 = PRF192;
            this.CSD201 = CSD201;
        }

        public void gpa() {
            System.out.println("Average of grade (GPA): " + (this.PRF192 + this.PRO192 + this.CSD201) / 3);
        }
    }

    public void printAllAttributes() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student ID: " + this.studentID);
        System.out.print("Birth of date: ");
        this.birthDate.layNgaySinh();
        System.out.println("Address: " + this.address);
        System.out.println("Major: " + this.major);
        layDiemGPA();
    }

    public void layNgaySinh() {
        this.birthDate.layNgaySinh();
    }

    public void layDiemGPA() {
        this.grade.gpa();
    }
}
