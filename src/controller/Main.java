package controller;

import model.entity.*;
import model.logic.ShopAssistance;

public class Main {
    public static void main(String[] args) {

        Flower[] flowers = new Flower[10];

        for (int i = 0; i < 5; i++) {
            flowers[i] = new Rose("Pink Panther", "pink", 3.5, 78, 200, 1.5, 5);
        }

        for (int i = 5; i < flowers.length; i++) {
            flowers[i] = new Sunflower("Pink Panther", "pink", 3.5, 78, 200, 15, 2);
        }

        Bouquet3 bouquet = new Bouquet3(flowers);
        double weight = ShopAssistance.calculateTotalWeight(bouquet);
        double price = ShopAssistance.calculateTotalPrice(bouquet);

        System.out.println(bouquet);
        System.out.println("Total price: " + price);
        System.out.println("Total weight: " + weight);
    }
}
