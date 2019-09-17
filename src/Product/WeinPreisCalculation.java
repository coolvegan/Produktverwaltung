package Product;

public class WeinPreisCalculation implements TagespreisInterface {
    @Override
    public double getTagesPreis(AbstractProductTemplate abstractProductTemplate) {
        return abstractProductTemplate.getGrundpreis();
    }
}
