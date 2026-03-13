package factory.entity.concreteproduct;

import factory.entity.abtractproduct.IChair;

public class ModernChair implements IChair {
    @Override
    public void sitOn() {
        System.out.println("Sitted on modern chair");
    }
}
