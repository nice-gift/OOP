package entity;

public class Gladiolus extends Flower {
    private int numFlwrsInInflr;
    private int numOpenFlwrsInInflr;
    private String inflrType;

/* Соцветия гладиолусов: 1 — однорядное; 2 — двухрядное; 3 — очередное;
4 — спиральное; 5 — двустороннее
Inflorescences of gladioli: 1 - single row; 2 - two-row; 3 - next;
4 - spiral; 5 - bilateral */

    public Gladiolus() {
        numFlwrsInInflr = 0;
        numOpenFlwrsInInflr = 0;
        inflrType = "undefined";
    }

    public Gladiolus(String name, String color, double price, double weight,
                     int length, int numFlwrsInInflr, int numOpenFlwrsInInflr,
                     String inflrType) {
        super(name, color, price, weight, length);
        this.numFlwrsInInflr = numFlwrsInInflr;
        this.numOpenFlwrsInInflr = numOpenFlwrsInInflr;
        this.inflrType = inflrType;
    }

    public Gladiolus(Gladiolus gladiolus) {
        this(gladiolus.getName(), gladiolus.getColor(), gladiolus.getPrice(),
                gladiolus.getWeight(), gladiolus.getLength(),
                gladiolus.numFlwrsInInflr, gladiolus.numOpenFlwrsInInflr,
                gladiolus.inflrType);
    }

    public int getNumFlwrsInInflr() {
        return numFlwrsInInflr;
    }

    public void setNumFlwrsInInflr(int numFlwrsInInflr) {
        if (numFlwrsInInflr >= 0 && numFlwrsInInflr < 50) {
            this.numFlwrsInInflr = numFlwrsInInflr;
        }
    }

    public int getNumOpenFlwrsInInflr() {
        return numOpenFlwrsInInflr;
    }

    public void setNumOpenFlwrsInInflr(int numOpenFlwrsInInflr) {
        if (numOpenFlwrsInInflr >= 0 && numOpenFlwrsInInflr <= numFlwrsInInflr) {
            this.numOpenFlwrsInInflr = numOpenFlwrsInInflr;
        }
    }

    public String getInflrType() {
        return inflrType;
    }

    public void setInflrType(String inflrType) {
        this.inflrType = inflrType;
    }

    @Override
    public String toString() {
        return super.toString() + ", numFlwrsInInflr = " +
                numFlwrsInInflr + ", numOpenFlwrsInInflr = " +
                numOpenFlwrsInInflr + ", inflrType = " + inflrType;
    }
}
