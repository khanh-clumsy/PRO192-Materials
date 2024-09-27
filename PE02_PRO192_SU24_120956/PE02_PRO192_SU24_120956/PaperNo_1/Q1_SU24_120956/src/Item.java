

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TQMinh
 */
public class Item {

    private String name;
    private int quantity;
    private String status;

    public Item() {
    }

    public Item(String name, int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
            this.status = "N/A";
        } else {
            this.status = "A";
            this.quantity = quantity;
        }
        this.name = name;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
            this.status = "N/A";
        } else {
            this.status = "A";
            this.quantity = quantity;
        }

    }

    @Override
    public String toString() {
        return name.toUpperCase() + "," + quantity + "," + status;
    }

}
