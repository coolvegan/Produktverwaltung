package Product;

import java.util.Date;

public class Cheese extends ExpirationProduct {
    private static int qualityMin = 30;
    public Cheese(double grundpreis, String bezeichnung, Integer quality, TagespreisInterface tagespreisInterface, Date erzeugungsdatum, QualityInterface qualityInterface, EntsorgungsInterface entsorgungsInterface) {
        super(grundpreis, bezeichnung, quality, tagespreisInterface, erzeugungsdatum, qualityInterface, entsorgungsInterface);
    }

    @Override
    public boolean entsorgbar() {
        return this.entsorgungsInterface.isEntsorgbar(this) || (this.quality < qualityMin);
    }
}
