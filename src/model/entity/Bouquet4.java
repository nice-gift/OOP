package model.entity;

import model.container.SingleList;

public class Bouquet4 {
    private SingleList flowers;


    public Bouquet4() {
        flowers = new SingleList();
    }

    public Bouquet4(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new SingleList(flowers);
        } else {
            this.flowers = new SingleList();
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
