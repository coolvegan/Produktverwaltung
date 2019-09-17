package Product;

import java.util.Date;

public abstract class AbstractProductTemplate implements AbstractProductTemplateInterface {
    protected double grundpreis;
    protected String bezeichnung;
    protected Integer quality;
    protected TagespreisInterface tagespreisInterface;
    protected Date Erzeugungsdatum;
    protected int alive;


    @Override
    public int getAlive() {
        return alive;
    }

    protected QualityInterface getQualityInterface() {
        return qualityInterface;
    }

    protected void setQualityInterface(QualityInterface qualityInterface) {
        this.qualityInterface = qualityInterface;
    }

    protected QualityInterface qualityInterface;

    @Override
    public Integer getQuality() {
        return quality;
    }

    @Override
    public Date getErzeugungsdatum() {
        return Erzeugungsdatum;
    }

    public AbstractProductTemplate(double grundpreis, String bezeichnung, Integer quality, TagespreisInterface tagespreisInterface, Date erzeugungsdatum, QualityInterface qualityInterface) {
        this.grundpreis = grundpreis;
        this.bezeichnung = bezeichnung;
        this.quality = quality;
        this.tagespreisInterface = tagespreisInterface;
        this.qualityInterface = qualityInterface;
        Erzeugungsdatum = erzeugungsdatum;
        alive = 0;
    }

    protected void setQuality(Integer quality) {
        this.quality = quality;
    }

    protected TagespreisInterface getTagespreisInterface() {
        return tagespreisInterface;
    }

    @Override
    public String getBezeichnung() {
        return bezeichnung;
    }

    protected void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public double getGrundpreis() {
        return grundpreis;
    }

    protected void setTagespreisInterface(TagespreisInterface tagespreisInterface){
        this.tagespreisInterface = tagespreisInterface;
    }

    @Override
    public double getTagesPreis()
    {
        return tagespreisInterface.getTagesPreis(this);
    }

    @Override
    public void nextDay(){
        alive++;
        qualityInterface.processRule(this);
    }
}
