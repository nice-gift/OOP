package model.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BouquetTest {
    private static Bouquet1 bouquet1;

    @Before
    public void init() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3, 110, 70),
                new Flower("Rose", "red", 3, 100, 80),
                new Flower("Rose", "red", 3, 120, 70),
        };

        bouquet1 = new Bouquet1(flowers);
    }

    @Test
    public void testGetByPositive() {

        int index = 1;
        Flower expected = new Flower("Rose", "red", 3, 100, 80);

        Flower actual = bouquet1.get(index);

        if (expected.getPrice() != actual.getPrice()
                || expected.getWeight() != actual.getWeight()
                || expected.getLength() != actual.getLength()
                || !expected.getName().equals(actual.getName())
                || !expected.getColor().equals(actual.getColor())) {
            fail();
        }
    }

    @Test
    public void firstTestGetIndexOutOfBound() {
        int index = -1;

        Flower actual = bouquet1.get(index);

        assertNull(actual);
    }

    @Test
    public void secondTestGetIndexOutOfBound() {
        int index = 3;

        Flower actual = bouquet1.get(index);

        assertNull(actual);
    }

    @Test
    public void testAdd() {

//        ArrayList<Flower> flowers = new ArrayList<>();
//        flowers.add(new Flower("Rose", "red", 3, 110, 70));
//        flowers.add(new Flower("Rose", "red", 3, 100, 80));
//        flowers.add(new Flower("Rose", "red", 3, 120, 70));

        bouquet1.add(new Flower("Rose", "red", 3, 121, 71));

        Flower[] expected = {
                new Flower("Rose", "red", 3, 110, 70),
                new Flower("Rose", "red", 3, 100, 80),
                new Flower("Rose", "red", 3, 120, 70),
                new Flower("Rose", "red", 3, 121, 71)
        };

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getPrice() != bouquet1.get(i).getPrice() ||
                    expected[i].getWeight() != bouquet1.get(i).getWeight() ||
                    expected[i].getLength() != bouquet1.get(i).getLength() ||
                    !expected[i].getColor().equals(bouquet1.get(i).getColor()) ||
                    !expected[i].getName().equals(bouquet1.get(i).getName())) {
                fail();
            }
        }
    }

    @Test
    public void testRemoveByIndex() {
        bouquet1.remove(1);

        Flower[] expected = {
                new Flower("Rose", "red", 3, 110, 70),
                new Flower("Rose", "red", 3, 120, 70)
        };

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getPrice() != bouquet1.get(i).getPrice() ||
                    expected[i].getWeight() != bouquet1.get(i).getWeight() ||
                    expected[i].getLength() != bouquet1.get(i).getLength() ||
                    !expected[i].getColor().equals(bouquet1.get(i).getColor()) ||
                    !expected[i].getName().equals(bouquet1.get(i).getName())) {
                fail();
            }
        }
    }

    @Test
    public void testRemoveByIndexOutOfBound() {
        bouquet1.remove(4);

        Flower[] expected = {
                new Flower("Rose", "red", 3, 110, 70),
                new Flower("Rose", "red", 3, 100, 80),
                new Flower("Rose", "red", 3, 120, 70),
        };

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getPrice() != bouquet1.get(i).getPrice() ||
                    expected[i].getWeight() != bouquet1.get(i).getWeight() ||
                    expected[i].getLength() != bouquet1.get(i).getLength() ||
                    !expected[i].getColor().equals(bouquet1.get(i).getColor()) ||
                    !expected[i].getName().equals(bouquet1.get(i).getName())) {
                fail();
            }
        }
    }

    @Test
    public void testRemoveByObject() {
        bouquet1.remove(new Flower("Rose", "red", 3, 100, 80));

        Flower[] expected = {
                new Flower("Rose", "red", 3, 110, 70),
                new Flower("Rose", "red", 3, 120, 70)
        };

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getPrice() != bouquet1.get(i).getPrice() ||
                    expected[i].getWeight() != bouquet1.get(i).getWeight() ||
                    expected[i].getLength() != bouquet1.get(i).getLength() ||
                    !expected[i].getColor().equals(bouquet1.get(i).getColor()) ||
                    !expected[i].getName().equals(bouquet1.get(i).getName())) {
                fail();
            }
        }
    }


    @Test
    public void testRemoveByNullObject() {
        bouquet1.remove(null);

        Flower[] expected = {
                new Flower("Rose", "red", 3, 110, 70),
                new Flower("Rose", "red", 3, 100, 80),
                new Flower("Rose", "red", 3, 120, 70)
        };

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getPrice() != bouquet1.get(i).getPrice() ||
                    expected[i].getWeight() != bouquet1.get(i).getWeight() ||
                    expected[i].getLength() != bouquet1.get(i).getLength() ||
                    !expected[i].getColor().equals(bouquet1.get(i).getColor()) ||
                    !expected[i].getName().equals(bouquet1.get(i).getName())) {
                fail();
            }
        }
    }
}
