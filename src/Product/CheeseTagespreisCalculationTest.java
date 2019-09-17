package Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CheeseTagespreisCalculationTest {
    @BeforeEach
    void setUp() {

    }

    private void assertEqual(int i, Integer quality) {
    }

    @Test
    void checkTagesPreisAndEntsorgbarkeit() {
        Cheese cheese = new Cheese(10, "gouda",40, new CheeseTagespreisCalculation(), new Date(), new CheeseQuality(), new CheeseExpiration(60));
        assertEqual(40, cheese.getQuality());
        cheese.nextDay();
        assertEqual(39, cheese.getQuality());
        assertFalse(cheese.entsorgbar());
        for (int i = 0; i < 10; i++)
        {
            cheese.nextDay();
        }
        assertEqual(29, cheese.getQuality());
        assertTrue(cheese.entsorgbar());
    }
    @Test
    void checkBuilder() {
        //Test müsste feiner granuliert werden....
        Cheese cheese = new Cheese(10, "gouda", 40, new CheeseTagespreisCalculation(), new Date(), new CheeseQuality(), new CheeseExpiration(60));
        CheeseBuilder cb = new CheeseBuilder();
        Cheese cheese_from_builder = cb.createKaese("gouda", 10, 60, 40);
        assertEquals(cheese.getGrundpreis(), cheese_from_builder.getGrundpreis());
        assertEquals(cheese.getQuality(), cheese_from_builder.getQuality());
        assertEquals(cheese.getAlive(), cheese_from_builder.getAlive());
        assertEquals(cheese.getTagesPreis(), cheese_from_builder.getTagesPreis());

        assertFalse(cheese.entsorgbar());
        assertFalse(cheese_from_builder.entsorgbar());

        for (int i = 0; i < 10; i++) {
            cheese.nextDay();
            cheese_from_builder.nextDay();
        }

        assertEquals(cheese.getGrundpreis(), cheese_from_builder.getGrundpreis());
        assertEquals(cheese.getQuality(), cheese_from_builder.getQuality());
        assertEquals(cheese.getAlive(), cheese_from_builder.getAlive());
        assertEquals(cheese.getTagesPreis(), cheese_from_builder.getTagesPreis());

        assertFalse(cheese.entsorgbar());
        assertFalse(cheese_from_builder.entsorgbar());

        cheese.nextDay();
        cheese_from_builder.nextDay();

        assertTrue(cheese.entsorgbar());
        assertTrue(cheese_from_builder.entsorgbar());
    }
    @Test
    void checkCheesePreis()
    {
        CheeseBuilder cb = new CheeseBuilder();
        Cheese cheese_from_builder = cb.createKaese("gouda", 10, 60, 40);
        assertEquals(14, cheese_from_builder.getTagesPreis());
        cheese_from_builder.nextDay();
        assertEquals(13.9, cheese_from_builder.getTagesPreis());

        Cheese cheese_from_builder2 = cb.createKaese("gouda", 15, 60, 40);
        assertEquals(19, cheese_from_builder2.getTagesPreis());

        Cheese cheese_from_builder3 = cb.createKaese("gouda", 19.50, 60, 90);
        assertEquals(28.5, cheese_from_builder3.getTagesPreis());
        cheese_from_builder3.nextDay();
        cheese_from_builder3.nextDay();
        cheese_from_builder3.nextDay();
        cheese_from_builder3.nextDay();
        cheese_from_builder3.nextDay();
        assertEquals(28.0, cheese_from_builder3.getTagesPreis());
    }
}

