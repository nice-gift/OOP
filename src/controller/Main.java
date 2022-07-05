package controller;

import model.container.SingleList;
import model.entity.*;
import model.logic.ShopAssistance;

import java.util.Random;

public class Main {
    public static final double MAX_PRICE = 10.0;
    public static final double MIN_PRICE = 1.0;

    public static void main(String[] args) {
//        SingleList singleList=new SingleList();
//        singleList.add(new Rose("Pink Panther", "pink", 3.6, 78, 200, 1.5, 5));
//        singleList.add(new Rose("Pink Panther", "pink", 3.5, 78, 200, 1.5, 5));
//        singleList.add(new Rose("Pink Panther", "pink", 3.8, 78, 200, 1.5, 5));
//        singleList.add(new Rose("Pink Panther", "pink", 3.9, 78, 200, 1.5, 5));
//        System.out.println(singleList.size());

        Flower[] flowers = new Flower[10];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
//            нужно добавить и мин
            double price = random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE;
            price = Double.parseDouble(String.format("%.2f", price));
            flowers[i] = new Rose("Pink Panther", "pink", price, 78, 200, 1.5, 5);
        }

        for (int i = 5; i < flowers.length; i++) {
            double price = random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE;
            flowers[i] = new Sunflower("Pink Panther", "pink", price, 78, 200, 15, 2);
        }

        Bouquet bouquet = new Bouquet(flowers);
        double totalWeight = ShopAssistance.calculateTotalWeight(bouquet);
        double totalPrice = ShopAssistance.calculateTotalPrice(bouquet);

        System.out.println(bouquet);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Total weight: " + totalWeight);
    }
}
