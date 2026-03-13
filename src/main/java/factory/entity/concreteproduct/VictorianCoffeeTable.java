package factory.entity.concreteproduct;

import factory.entity.abtractproduct.ICoffeeTable;

public class VictorianCoffeeTable implements ICoffeeTable {


    @Override
    public void putCoffee() {
        System.out.println("Putted coffee on victorian coffee table");
    }
}
