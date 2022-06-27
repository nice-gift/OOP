package model.container;

import model.entity.Flower;

public class DynamicArray {
    private Flower[] flowers;

    public DynamicArray() {
        flowers = new Flower[0];
    }

    public DynamicArray(Flower[] flowers) {
        this.flowers = flowers;
    }

    public boolean isEmpty() {
        return flowers.length == 0;
    }

    public int size() {
        return flowers.length;
    }

    public Flower get(int index) {
        return flowers[index];
    }

    public void add(Flower flower) {
        Flower[] temp = new Flower[flowers.length + 1];

        for (int i = 0; i < flowers.length; i++) {
            temp[i] = flowers[i];
        }

        temp[flowers.length] = flower;
        flowers = temp;
    }

    public void remove(int index) {
        Flower[] temp = new Flower[flowers.length - 1];

        for (int i = 0, j = 0; i < flowers.length; i++) {
            if (i != index) {
                temp[j] = flowers[i];
                j++;
            }
        }
        flowers = temp;
    }

}
