package controller;

import entity.Gladiolus;
import entity.Rose;
import entity.Sunflower;

public class Main {
    public static void main(String[] args) {
        Gladiolus gladiolus = new Gladiolus();
        Gladiolus gladiolus1 = new Gladiolus(gladiolus);
        System.out.println(gladiolus);
        System.out.println(gladiolus1);
        Rose rose = new Rose("rose", "red", 5.2, 105, 70, 80, 5);
        Rose rose1 = new Rose();
        rose.setLengthOfThorn(90);
        System.out.println(rose.getLengthOfThorn());
        System.out.println(rose);
        System.out.println(rose1);

        Sunflower sunflower=new Sunflower();
        System.out.println(sunflower);
    }
}
