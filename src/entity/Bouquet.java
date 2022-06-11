package entity;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers;


    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public Bouquet(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new ArrayList<>();
            for (Flower flower : flowers) {
                this.flowers.add(flower);
            }
        } else {
            flowers = new Flower[0];
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
        if (flower == null) {
            return;}

        ArrayList<Flower> temp = new ArrayList<>();

        for (Flower f : flowers) {
            temp.add(f);
        }

        temp.add(flower);
        flowers = temp;
    }

    public void remove(Flower flower) {
        if (flower == null) {
            return;}

        boolean flag = false;
        ArrayList<Flower> temp = new ArrayList<>();

        for (int i = 0; i < flowers.size(); i++) {

            if (flag || (!flowers.get(i).getName().equals(flower.getName())
                    || !flowers.get(i).getColor().equals(flower.getColor())
                    || flowers.get(i).getLength() != flower.getLength()
                    || flowers.get(i).getWeight() != flower.getWeight()
                    || flowers.get(i).getPrice() != flower.getPrice())) {
                temp.add(flowers.get(i));
            } else {
                flag = true;
            }
        }
        flowers = temp;
    }

    public void remove(int index) {
        if (index >= 0 && index < flowers.size()) {
            ArrayList<Flower> temp = new ArrayList<>();

            for (int i = 0; i < flowers.size(); i++) {

                if (index != i) {
                    temp.add(flowers.get(i));
                }
            }
            flowers = temp;
        }
    }
}