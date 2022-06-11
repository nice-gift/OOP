package model.logic;

import entity.Bouquet;
import entity.Flower;
import org.junit.*;

import static org.junit.Assert.*;

public class ShopAssistanceTest {

    private static Bouquet bouquet;

    @BeforeClass
    public static void init() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3, 100, 70),
                new Flower("Rose", "red", 3, 100, 80),
                new Flower("Rose", "red", 3, 100, 70),
                new Flower("Rose", "red", 3, 100, 70),
                new Flower("Rose", "red", 3, 100, 70)
        };

        bouquet = new Bouquet(flowers);
    }

//    @AfterClass
//    public static void destroy() {
//        bouquet = null;
//    }
//
//
//    @Before
//    public void connect() {
//        System.out.println("connect");
//    }
//
//    @After
//    public void disconnect() {
//        System.out.println("disconnect");
//    }

    @Test
    public void testCalculateTotalPricePositive() {

        double expected = (ShopAssistance.LABOR_PERCENT + 1) * 15;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testCalculateTotalPriceWithNull() {
        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalPriceWithEmpty() {
        Flower[] flowers = new Flower[0];
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWeightPositive() {

        double expected = 500;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateTotalWeightWithNull() {
        double expected = 0;

        double actual = ShopAssistance.calculateTotalWeight(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWeightWithEmpty() {
        Flower[] flowers = new Flower[0];
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void firstTestFindFlowersWithMaxLength() {

        Flower[] expected = {new Flower("Rose", "red", 3, 100, 80)};

        Flower[] actual = ShopAssistance.findFlowersWithMaxLength(bouquet);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getPrice() != actual[i].getPrice() ||
                    expected[i].getWeight() != actual[i].getWeight() ||
                    expected[i].getLength() != actual[i].getLength() ||
                    !expected[i].getColor().equals(actual[i].getColor()) ||
                    !expected[i].getName().equals(actual[i].getName())) {
                fail();
            }
        }
    }

    @Test
    public void secondTestFindFlowersWithMaxLength() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3, 100, 70),
                new Flower("Rose", "red", 4, 120, 90),
                new Flower("Rose", "red", 3, 100, 70),
                new Flower("Rose", "red", 3, 100, 70),
                new Flower("Rose", "red", 4, 120, 90)
        };

        Bouquet bouquet = new Bouquet(flowers);

        Flower[] expected = {new Flower("Rose", "red", 4, 120, 90),
                new Flower("Rose", "red", 4, 120, 90)};

        Flower[] actual = ShopAssistance.findFlowersWithMaxLength(bouquet);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getPrice() != actual[i].getPrice() ||
                    expected[i].getWeight() != actual[i].getWeight() ||
                    expected[i].getLength() != actual[i].getLength() ||
                    !expected[i].getColor().equals(actual[i].getColor()) ||
                    !expected[i].getName().equals(actual[i].getName())) {
                fail();
            }
        }
    }

}
