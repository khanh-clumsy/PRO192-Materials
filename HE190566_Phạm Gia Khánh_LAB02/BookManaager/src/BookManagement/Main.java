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
        Book b1 = new Book("Mohammed Salah", "Liverpool", 300, true);
        Book b2 = new Book("Raheem Sterling", "Chelsea", 20, false);
        System.out.println(b1.getAuthor());
        b1.setTitle("Animal Farm");
        b1.setNoOfPages(112);
        b2.setFiction(false);
        System.out.println(b2.getTitle());
        System.out.println(b1.isFiction());
        b1.printAll();
        b2.printAll();
    }
}
