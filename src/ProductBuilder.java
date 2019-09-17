import Product.CheeseBuilder;
import Product.WeinBuilder;

public class ProductBuilder {
    private CheeseBuilder cheeseBuilder;
    private WeinBuilder weinBuilder;
    ProductBuilder()
    {
        cheeseBuilder = new CheeseBuilder();
        weinBuilder = new WeinBuilder();
    }

    public WeinBuilder Wein()
    {
        return weinBuilder;
    }

    public CheeseBuilder Cheese()
    {
        return cheeseBuilder;
    }
}
