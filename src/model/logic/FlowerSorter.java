package model.logic;

import model.entity.Bouquet;
import model.entity.Flower;
import model.logic.TheStrategyPattern.FlowersComparable;

public class FlowerSorter {
    public static void bubbleSort(Bouquet bouquet, FlowersComparable flowersComparable) {
        for (int i = 0; i < bouquet.size() - 1; i++) {
            for (int j = 0; j < bouquet.size() - 1 - i; j++) {
                if (flowersComparable.compare(bouquet.get(j), bouquet.get(j + 1))) {
                    Flower flower = bouquet.get(j);
                    bouquet.set(j, bouquet.get(j + 1));
                    bouquet.set(j + 1, flower);
                }
            }
        }
    }
}
