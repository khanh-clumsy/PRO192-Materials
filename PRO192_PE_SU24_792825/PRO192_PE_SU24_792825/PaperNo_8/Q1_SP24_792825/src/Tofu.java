/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Tofu {
    private String maker;
    private int quantity;

    public Tofu() {
    }

    public Tofu(String maker, int quantity) {
        this.maker = maker;
        this.quantity = quantity;
    }

    public String getMaker() {
        return maker.substring(0,1).toLowerCase() + maker.substring(1, maker.length()-1) + maker.substring(maker.length()-1).toLowerCase();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
