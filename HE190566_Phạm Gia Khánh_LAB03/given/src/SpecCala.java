/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author admin
 */
public class SpecCala extends Cala {
    private int color;

    public SpecCala(String owner, int price) {
        super(owner, price);
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return this.owner + " : " + this.price + " " + this.color;
    }

    public void setData() {
        String newOwner = "";
        for (int i = 0; i < owner.length(); i++) {
            if (i == 0){
                newOwner += Character.toUpperCase(owner.charAt(i));
            }
            else{
                newOwner += Character.toLowerCase(owner.charAt(i));
            }
        }
        this.owner = newOwner;
    }
    public int getValue(){
        if (color % 2 == 0){
            return price + 1;
        }else{
            return this.price * 2;
        }
    }

}
