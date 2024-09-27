/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SpecCar extends Car{
    private int warranty;

    public SpecCar() {
    }

    public SpecCar(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f, %d", this.getName().toUpperCase(), this.getPrice(), warranty);
    }

    public int getWarranty() {
        if (this.getName().equalsIgnoreCase("Audi")){
            return warranty + 5;
        }
        else{
            return warranty + 2;
        }
    }
    
}
