package model.logic.TheStrategyPattern;

import model.entity.Flower;

public class SortFlowerByNameAsc implements FlowersComparable {
    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getName().compareTo(flower2.getName()) > 0;
    }
}
