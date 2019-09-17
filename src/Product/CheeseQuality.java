package Product;

public class CheeseQuality implements QualityInterface {
    @Override
    public void processRule(AbstractProductTemplate abstractProductTemplate) {
        abstractProductTemplate.setQuality(abstractProductTemplate.getQuality()-1);
    }
}
