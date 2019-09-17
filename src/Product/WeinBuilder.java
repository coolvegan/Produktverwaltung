package Product;

import java.util.Date;

public class WeinBuilder {
    public Wein createWein(String bezeichner, double preis, int quality){
        Wein wein = new Wein(preis, bezeichner, quality, new WeinPreisCalculation(), new Date(), new WeinQuality());
        return wein;
    }
}
