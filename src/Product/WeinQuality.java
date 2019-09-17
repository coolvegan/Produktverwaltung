package Product;

public class WeinQuality implements  QualityInterface{
    private int qualityIncrement;
    private static int refinementPeriod = 10;
    private static int refinementMax = 50;

    public WeinQuality() {
        this.qualityIncrement = 0;
    }

    @Override
    public void processRule(AbstractProductTemplate abstractProductTemplate) {
        if (abstractProductTemplate.getQuality() < refinementMax)
        {
            abstractProductTemplate.setQuality(abstractProductTemplate.getQuality()-this.qualityIncrement);
            this.qualityIncrement = abstractProductTemplate.getAlive() / refinementPeriod;
            abstractProductTemplate.setQuality((abstractProductTemplate.getQuality() + this.qualityIncrement));
        }
    }
}
