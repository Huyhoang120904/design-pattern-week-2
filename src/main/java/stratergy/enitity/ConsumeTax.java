package stratergy.enitity;

public class ConsumeTax implements TaxStrategy{
    @Override
    public float payTax(int amount) {
        return 0.1f * amount;
    }
}
