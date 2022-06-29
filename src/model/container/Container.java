package model.container;

import model.entity.Flower;

public interface Container {
      int size();

    Flower get(int index);

    void add(Flower flower);

    void remove(int index);
}
