package model.logic;

import model.entity.Bouquet;
import model.entity.Flower;

public class FlowerSorter {
    public static void bubbleSortByPriceAsc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getPrice() > bouquet.get(j + 1).getPrice()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }

    public static void bubbleSortByPriceDsc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getPrice() < bouquet.get(j + 1).getPrice()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }

    public static void bubbleSortByLengthAsc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getLength() > bouquet.get(j + 1).getLength()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }

    public static void bubbleSortByLengthDsc(Bouquet bouquet) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (bouquet.get(j).getLength() < bouquet.get(j + 1).getLength()) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }
}
