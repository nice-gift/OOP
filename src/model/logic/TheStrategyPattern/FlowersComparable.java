package model.logic.TheStrategyPattern;

import model.entity.Flower;

public interface FlowersComparable {
    boolean compare(Flower flower1, Flower flower2);
}
