package factory.entity.concreteproduct;

import factory.entity.abtractproduct.IChair;

public class VictorianChair implements IChair {

    @Override
    public void sitOn() {
        System.out.println("Sitted on victorian chair");
    }
}
