package Product;

import java.util.Date;

public class CheeseBuilder {
    public Cheese createKaese(String bezeichner, double grundpreis, int verfallsdauer, int quality)
    {
        return  new Cheese(grundpreis, bezeichner, quality, new CheeseTagespreisCalculation(), new Date(), new CheeseQuality(), new CheeseExpiration(verfallsdauer));
    }

}
