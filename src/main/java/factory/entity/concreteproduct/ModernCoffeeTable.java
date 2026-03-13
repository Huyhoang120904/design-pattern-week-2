package factory.entity.concreteproduct;

import factory.entity.abtractproduct.ICoffeeTable;

public class ModernCoffeeTable implements ICoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Putted coffee on the modern coffe table");
    }
}
