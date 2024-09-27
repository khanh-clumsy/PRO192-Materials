/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Cala {

    protected String owner;
    protected int price;

    public Cala(String owner, int price) {
        if (this.price <= 0){
            throw new InvalidPriceException("Price must be a positive number!");
        }
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.owner + " : " + this.price;
    }
    
}
