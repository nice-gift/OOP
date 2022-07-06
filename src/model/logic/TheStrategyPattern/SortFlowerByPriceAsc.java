package model.logic.TheStrategyPattern;

import model.entity.Flower;

public class SortFlowerByPriceAsc implements FlowersComparable {

    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getPrice() > flower2.getPrice();
    }
}
