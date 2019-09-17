package Product;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class WeinQualityTest {
    @org.junit.jupiter.api.Test
    void processRule() {
        //Standardtests - Nicht wie im Sinne des Erfinders
        //Quick & Dirty um sicherzustellen, dass Spezifikation erfüllt werden
        Wein wein = new Wein(10, "rotwein", 20, new WeinPreisCalculation(), new Date(), new WeinQuality());
        assertEquals(10, wein.getGrundpreis());
        for (int i = 0; i < 10; i++)
        {
            wein.nextDay();
        }
        assertEquals(21, wein.getQuality());
        for (int i = 0; i < 10; i++)
        {
            wein.nextDay();
        }
        assertEquals(22, wein.getQuality());
        for (int i = 0; i < 80; i++)
        {
            wein.nextDay();
        }
        assertEquals(30, wein.getQuality());
        for (int i = 0; i < 200; i++)
        {
            wein.nextDay();
        }
        assertEquals(50, wein.getQuality());
        wein.nextDay();
        wein.nextDay();
        wein.nextDay();
        wein.nextDay();
        assertEquals(50, wein.getQuality());
    }
}