/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Date d1 = new Date(16, 12, 2005);
        Date d2 = new Date(7, 9, 2005);
        Student s1 = new Student("Vu Khanh Linh", "1", d1, "Ha Noi", "Pharmacy", null);
        Student s2 = new Student("Pham Gia Khanh", "2", d2, "Ha Noi", "IT", null);
        Student.Grade g1 = s1.new Grade(6, 7, 8);
        Student.Grade g2 = s1.new Grade(7, 6, 6);
        s1 = new Student("Vu Khanh Linh", "1", d1, "Ha Noi", "Pharmacy", g1);
        s2 = new Student("Pham Gia Khanh", "2", d2, "Ha Noi", "IT", g2);
        s1.printAllAttributes();
        s2.printAllAttributes();
        s1.layNgaySinh();
        s2.layDiemGPA();
        s2.layNgaySinh();
        System.out.println(s2.getMajor());
    }
}
