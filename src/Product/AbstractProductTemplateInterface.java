package Product;

import java.util.Date;

public interface AbstractProductTemplateInterface {
    int getAlive();

    Integer getQuality();

    Date getErzeugungsdatum();

    String getBezeichnung();

    double getGrundpreis();

    double getTagesPreis();

    boolean entsorgbar();

    void nextDay();
}
