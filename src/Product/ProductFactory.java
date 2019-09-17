
package Product;

public class ProductFactory {
    CheeseBuilder cheeseBuilder;
    WeinBuilder weinBuilder;

    public ProductFactory() {
        this.cheeseBuilder = new CheeseBuilder();
        this.weinBuilder = new WeinBuilder();
    }

    //Factory Method - Open Closed Prinzip wird gebrochen
    public AbstractProductTemplateInterface getInstance(Products p)
    {
        if (p == Products.Boulette_de_Huy)
        {
            return this.cheeseBuilder.createKaese("Boulette_de_Huy", 20, 50, 80);
        }
        if (p == Products.Chimay)
        {
            return this.cheeseBuilder.createKaese("Chimay", 5, 90, 35);
        }
        if (p == Products.Gouda)
        {
            return this.cheeseBuilder.createKaese("Gouda", 12, 51, 39);
        }
        if (p == Products.Dezzani)
        {
            return this.weinBuilder.createWein("Dezzani",9.50, 1000);
        }
        if (p == Products.DORNFELDER_TROCKEN)
        {
            return this.weinBuilder.createWein("DORNFELDER_TROCKEN",13.50, 5);
        }
        if (p == Products.Luis_Canas)
        {
            return this.weinBuilder.createWein("Luis_Canas_1992",1201.50, 30);
        }
        return new NullProduct();
    }
}
