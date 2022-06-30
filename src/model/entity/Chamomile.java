package model.entity;

public class Chamomile extends Flower {
    private int numOfPetals;

    public Chamomile() {
    }

    public Chamomile(String name, String color, double price, double weight,
                     int length, int numOfPetals) {
        super(name, color, price, weight, length);
        this.numOfPetals = numOfPetals;
    }

    public Chamomile(Chamomile chamomile) {
        this(chamomile.getName(), chamomile.getColor(), chamomile.getPrice(),
                chamomile.getWeight(), chamomile.getLength(),
                chamomile.numOfPetals);
    }

    public void setNumOfPetals(int numOfPetals) {
        if (numOfPetals >= 0) {
            this.numOfPetals = numOfPetals;
        }
    }

    public int getNumOfPetals() {
        return numOfPetals;
    }

    @Override
    public int hashCode() {
        int code = 31;

        return super.hashCode() * code + numOfPetals;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!super.equals(o)) return false;

        Chamomile chamomile = (Chamomile) o;

        return numOfPetals == chamomile.numOfPetals;
    }

    @Override
    public String toString() {
        return super.toString() + ", numOfPetals = " + numOfPetals;
    }
}
