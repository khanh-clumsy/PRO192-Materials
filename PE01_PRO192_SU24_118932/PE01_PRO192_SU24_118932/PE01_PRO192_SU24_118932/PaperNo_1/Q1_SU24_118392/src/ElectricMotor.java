/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class ElectricMotor {

    private String name;
    private int voltage;
    private int current;

    public ElectricMotor() {
    }

    public ElectricMotor(String name, int voltage, int current) {
        if (voltage > 220 || voltage < 110) {
            this.voltage = 120;
        } else {
            this.voltage = voltage;

        }
        if (current <= 0) {
            this.current = 1;
        } else {
            this.current = current;

        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return this.voltage * this.current;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return this.name.toUpperCase() + ", " + this.voltage + ", " + this.current + ", " + this.getPower();
    }

}
