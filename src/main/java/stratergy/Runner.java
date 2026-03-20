package stratergy;

import stratergy.enitity.ConsumeTax;
import stratergy.enitity.Product;
import stratergy.enitity.VatTax;

public class Runner {
    public static void main(String[] args) {
        Product product = new Product(new VatTax());

        System.out.println(product.getTax(1000));

        Product product2 = new Product(new ConsumeTax());

        System.out.println(product2.getTax(1000));
    }
}
