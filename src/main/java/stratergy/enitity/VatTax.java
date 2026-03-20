package stratergy.enitity;

public class VatTax implements TaxStrategy {

    @Override
    public float payTax(int amount) {
        return (0.05f * amount);
    }
}
