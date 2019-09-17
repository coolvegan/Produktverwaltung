package Product;

import java.util.Date;

public abstract class ExpirationProduct extends AbstractProductTemplate {
    protected EntsorgungsInterface entsorgungsInterface;

    public ExpirationProduct(double grundpreis, String bezeichnung, Integer quality, TagespreisInterface tagespreisInterface, Date erzeugungsdatum, QualityInterface qualityInterface, EntsorgungsInterface entsorgungsInterface) {
        super(grundpreis, bezeichnung, quality, tagespreisInterface, erzeugungsdatum, qualityInterface);
        this.entsorgungsInterface = entsorgungsInterface;
    }
}
