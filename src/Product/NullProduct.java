package Product;

import java.util.Date;

public class NullProduct implements AbstractProductTemplateInterface {
    @Override
    public int getAlive() {
        System.out.println("NullProduct getAlive Execute");
        return 0;
    }

    @Override
    public Integer getQuality() {
        System.out.println("NullProduct getQuality Execute");
        return -1;
    }

    @Override
    public Date getErzeugungsdatum() {
        System.out.println("NullProduct getErzeugungsdatum Execute");
        return new Date();
    }

    @Override
    public String getBezeichnung() {
        System.out.println("NullProduct getBezeichnung Execute");
        return "NullProduct";
    }

    @Override
    public double getGrundpreis() {
        System.out.println("NullProduct getGrundpreis Execute");
        return 0;
    }

    @Override
    public double getTagesPreis() {
        System.out.println("NullProduct getTagesPreis Execute");
        return 0;
    }

    @Override
    public boolean entsorgbar() {
        System.out.println("NullProduct entsorgbar Execute");
        return false;
    }

    @Override
    public void nextDay() {
        System.out.println("NullProduct NextDay Execute");
    }
}
