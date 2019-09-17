package Product;

public class CheeseTagespreisCalculation implements TagespreisInterface {
    private static double QualityProductConstant = 0.1;
    @Override
    public double getTagesPreis(AbstractProductTemplate abstractProductTemplate) {
        return abstractProductTemplate.getGrundpreis() + (QualityProductConstant * abstractProductTemplate.getQuality());
    }
}
