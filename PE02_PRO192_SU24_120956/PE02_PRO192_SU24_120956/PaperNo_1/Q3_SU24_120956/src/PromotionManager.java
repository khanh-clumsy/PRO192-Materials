/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class PromotionManager extends ArrayList<Promotion> {

    public void addPromotion(Promotion promotion) {
        this.add(promotion);
    }

    public double getMinDiscountPercentage() {
        Promotion min = this.get(0);
        for (Promotion promotion : this) {
            if (promotion.getDiscountPercentage() < min.getDiscountPercentage()) {
                min = promotion;
            }
        }
        return min.getDiscountPercentage();
    }

    public double sumDiscountPercentageByValue(double value) {
        double sum = 0;
        for (Promotion promotion : this) {
            if (promotion.getDiscountPercentage() >= value) {
                sum += promotion.getDiscountPercentage();
            }
        }
        return sum;
    }
}
