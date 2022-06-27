package model.entity;

import model.container.DynamicArray;

public class Bouquet3 {
    private DynamicArray flowers;


    public Bouquet3() {
        flowers = new DynamicArray();
    }

    public Bouquet3(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new DynamicArray(flowers);
        } else {
            this.flowers = new DynamicArray();
        }
    }

    public int size() {
        return flowers.size();
    }

    public Flower get(int index) {
        if (index >= 0 && index < flowers.size()) {
            return flowers.get(index);
        }
        return null;
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public void remove(int index) {
        flowers.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("List of flowers: ");

        for (int i = 0; i < flowers.size(); i++) {
            stringBuilder.append("\n").append(flowers.get(i));
        }

        return stringBuilder + "";
    }
}

