package Product;

import java.util.Date;

public class Wein extends AbstractProductTemplate {
    public Wein(double grundpreis, String bezeichnung, Integer quality, TagespreisInterface tagespreisInterface, Date erzeugungsdatum, QualityInterface qualityInterface) {
        super(grundpreis, bezeichnung, quality, tagespreisInterface, erzeugungsdatum, qualityInterface);

        if (quality < 1) {
            try {
                throw new WeinQualityOutOfBoundsException("Die Spezifikation erlaubt keine negativen Qualitätsattributwerte für Product.Wein!");
            } catch (WeinQualityOutOfBoundsException weinQualityOutOfBounds) {
                weinQualityOutOfBounds.printStackTrace();
            }
        }
    }

    @Override
    public boolean entsorgbar() {
        return false;
    }
}
