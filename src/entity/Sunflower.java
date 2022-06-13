package entity;

public class Sunflower extends Flower {
    private int headDiameter;
    private int numOfLeaves;

    public Sunflower() {
    }

    public Sunflower(String name, String color, double price, double weight,
                     int length, int headDiameter, int numOfLeaves) {
        super(name, color, price, weight, length);
        this.headDiameter = headDiameter;
        this.numOfLeaves = numOfLeaves;
    }

    public Sunflower(Sunflower sunflower) {
        this(sunflower.getName(), sunflower.getColor(), sunflower.getPrice(),
                sunflower.getWeight(), sunflower.getLength(),
                sunflower.headDiameter, sunflower.numOfLeaves);
    }

    public int getHeadDiameter() {
        return headDiameter;
    }

    public void setHeadDiameter(int headDiameter) {
        if (headDiameter >= 0 && headDiameter <= 50) {
            this.headDiameter = headDiameter;
        }
    }

    public int getNumOfLeaves() {
        return numOfLeaves;
    }

    public void setNumOfLeaves(int numOfLeaves) {
        if (numOfLeaves >= 0 && numOfLeaves <= 20) {
            this.numOfLeaves = numOfLeaves;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sunflower sunflower = (Sunflower) o;

        if (headDiameter != sunflower.headDiameter) return false;
        return numOfLeaves != sunflower.numOfLeaves;
    }

    @Override
    public int hashCode() {
        int code = 31;
        int hash = super.hashCode() * code + headDiameter;
        hash = hash * code + numOfLeaves;
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + ", headDiameter = " + headDiameter +
                ", numOfLeaves = " + numOfLeaves;
    }
}
