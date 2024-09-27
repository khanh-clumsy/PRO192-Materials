
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SoidStateDrive extends Product {

    private String code;
    private int speed;
    private int quantity;
    private double price;

    public SoidStateDrive() {
    }

    public SoidStateDrive(String code, int speed, int quantity, double price, String name, String brand) {
        super(name, brand);
        this.code = code;
        this.speed = speed;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.code + ", " + this.name + ", " + this.brand + ", " + this.speed + ", " + String.format("%.2f", this.price);
    }

    @Override
    public double getFinalPrice() {
        double finalPrice = 0;
        if (speed <= 1024) {
            finalPrice = price * 80 / 100;
        } else if (speed > 1024 && speed <= 2048) {
            finalPrice = price * 90 / 100;
        } else if (speed > 2048) {
            finalPrice = price * 95 / 100;
        }
        return finalPrice;
    }

    @Override
    public double getTotalAmount() {
        double totalAmount = quantity * this.getFinalPrice();
        return totalAmount;
    }

}
