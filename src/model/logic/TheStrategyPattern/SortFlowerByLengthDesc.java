package model.logic.TheStrategyPattern;

import model.entity.Flower;

public class SortFlowerByLengthDesc implements FlowersComparable {

    @Override
    public boolean compare(Flower flower1, Flower flower2) {
        return flower1.getLength() < flower2.getLength();
    }
}


