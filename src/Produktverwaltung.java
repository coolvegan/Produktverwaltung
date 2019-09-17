import Product.AbstractProductTemplateInterface;
import Product.ProductFactory;
import Product.Products;

import java.util.ArrayList;

public class Produktverwaltung{
    private ArrayList<AbstractProductTemplateInterface> sortiment = new ArrayList<>();
    private ProductFactory productFactory = new ProductFactory();
    private OutputStrategyInterface outputStrategyInterface = new ConsoleOutputStrategy();

    public void setOutputStrategyInterface(OutputStrategyInterface outputStrategyInterface) {
        this.outputStrategyInterface = outputStrategyInterface;
    }
    //Todo rausschmeißen
    public  void removeAllGarbageProducts()
    {
        for (int i = 0; i < sortiment.size() ; i++) {
            if (sortiment.get(i).entsorgbar())
            {
                sortiment.remove(i);
            }
        }
    }

    public void removeProduct(int i)
    {
        //Todo safe guard
        sortiment.remove(i);
    }

    public int getDaysToPreviewInDisplay() {
        if (daysToPreviewInDisplay > 0)
        {
            return daysToPreviewInDisplay;
        }
        else
        {
            return 1;
        }
    }

    public void setDaysToPreviewInDisplay(int daysToPreviewInDisplay) {
        if (daysToPreviewInDisplay > 0) {
            this.daysToPreviewInDisplay = daysToPreviewInDisplay;
        }
    }

    private int daysToPreviewInDisplay = 1;
    ProductBuilder buildGeneric = new ProductBuilder();

    public ArrayList<AbstractProductTemplateInterface> getSortiment()
    {
        return this.sortiment;
    }

    public void addStockProduct(Products products)
    {
        sortiment.add(productFactory.getInstance(products));
    }

    public void addGenericProduct(AbstractProductTemplateInterface abstractProductTemplateInterface){
        //Todo Guard Clause
        sortiment.add(abstractProductTemplateInterface);
    }

    void display(){
        outputStrategyInterface.run(this);
    }
}
