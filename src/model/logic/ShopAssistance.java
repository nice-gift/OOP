package model.logic;

import model.entity.Bouquet3;
import model.entity.Flower;

public class ShopAssistance {
    public static double LABOR_PERCENT = 0.1;

    public static double calculateTotalPrice(Bouquet3 bouquet) {

        if (bouquet == null || bouquet.size() == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < bouquet.size(); i++) {
            total += bouquet.get(i).getPrice();
        }

        return total + total * LABOR_PERCENT;
    }

    public static double calculateTotalWeight(Bouquet3 bouquet) {

        if (bouquet == null || bouquet.size() == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < bouquet.size(); i++) {
            total += bouquet.get(i).getWeight();
        }

        return total;
    }

    private static int getMaxLength(Bouquet3 bouquet) {
        int max = bouquet.get(0).getLength();

        for (int i = 0; i < bouquet.size(); i++) {
            if (max < bouquet.get(i).getLength()) {
                max = bouquet.get(i).getLength();
            }
        }
        return max;
    }

    private static int countFlowersWithMaxLength(Bouquet3 bouquet, int maxLength) {
        int count = 0;

        for (int i = 0; i < bouquet.size(); i++) {
            if (bouquet.get(i).getLength() == maxLength) {
                count++;
            }
        }

        return count;
    }

    public static Flower[] findFlowersWithMaxLength(Bouquet3 bouquet) {
        int maxLength = getMaxLength(bouquet);
        int count = countFlowersWithMaxLength(bouquet, maxLength);

        Flower[] result = new Flower[count];

        for (int i = 0, j = 0; i < bouquet.size(); i++) {
            if (bouquet.get(i).getLength() == maxLength) {
                result[j] = bouquet.get(i);
                j++;
            }
        }

        return result;
    }

}
