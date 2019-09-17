package Product;

public class CheeseExpiration extends ExpirationProperty{

    public CheeseExpiration(int verfallInTagen) {
        super(verfallInTagen);
        if ((verfallInTagen < 50) || (verfallInTagen > 100))
        {
            try {
                throw new CheeseExpirationOutOfBoundsException("Käse besitzt laut Spezifikation ein Verfallsdatum zwischen 50 und 100 Tagen!");
            } catch (CheeseExpirationOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }
}
