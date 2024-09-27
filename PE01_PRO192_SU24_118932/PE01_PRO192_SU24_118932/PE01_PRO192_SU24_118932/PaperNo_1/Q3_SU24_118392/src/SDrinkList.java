
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SDrinkList extends ArrayList<SDrink>{
    public void addSDrink(SDrink sdrink){
        this.add(sdrink);
    }
    public int getSDrinkByMake(String value){
        int count = 0;
        for (SDrink sdrink : this){
            if (sdrink.getMake().equalsIgnoreCase(value)){
                count++;
            }
        }
        return count;
    }
    public SDrink getSDrinkWithMinPrice(){
        SDrink minPrice = this.get(0);
        if (this.isEmpty()){
            return null;
        }
        for (SDrink sdrink : this){
            if (sdrink.getPrice() < minPrice.getPrice()){
                minPrice = sdrink;
            }
        }
        return minPrice;
    }
}
