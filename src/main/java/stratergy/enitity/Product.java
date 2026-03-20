package stratergy.enitity;

public class Product {

    TaxStrategy taxStrategy;

    public Product(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public float getTax(int amount) {
        return taxStrategy.payTax(amount);
    }

}
