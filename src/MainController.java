import Product.*;

import java.util.ArrayList;
import java.util.Date;

import static Product.Products.*;

public class MainController
{

    public static void main(String[] args)
    {
        //Lösung einer Bewerbungsaufgabe von einem deutschen mittelständischem Unternehmen
        //Wer besser als ich programmiert muss eine von mir entwickelte KI sein! ;-)
        Produktverwaltung produktverwaltung = new Produktverwaltung();
        AbstractProductTemplateInterface genC = produktverwaltung.buildGeneric.Cheese().createKaese("Regionaler Bauern Käse", 10,60, 99);
        AbstractProductTemplateInterface genW = produktverwaltung.buildGeneric.Wein().createWein("Regionaler Rotwein", 43.5, 80);
        produktverwaltung.addGenericProduct(genC);
        produktverwaltung.addGenericProduct(genW);
        produktverwaltung.addStockProduct(Boulette_de_Huy);
        produktverwaltung.addStockProduct(Chimay);
        produktverwaltung.addStockProduct(Gouda);
        produktverwaltung.addStockProduct(Dezzani);
        produktverwaltung.addStockProduct(Luis_Canas);
        produktverwaltung.addStockProduct(DORNFELDER_TROCKEN);

        AbstractProductTemplateInterface Sonderfallprodukt = new AbstractProductTemplate(10, "SonderfallProdukt", 100, new WeinPreisCalculation(), new Date(), new CheeseQuality()) {
            @Override
            public boolean entsorgbar() {
                //Do something nasty in here
                return false;
            }
        };

        produktverwaltung.addGenericProduct(Sonderfallprodukt);
        produktverwaltung.setDaysToPreviewInDisplay(100);
        produktverwaltung.display();
        produktverwaltung.setOutputStrategyInterface(new IntroduceOutputStrategy());
        produktverwaltung.display();
    }
}
