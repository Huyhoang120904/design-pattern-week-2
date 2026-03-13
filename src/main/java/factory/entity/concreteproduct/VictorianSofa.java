package factory.entity.concreteproduct;

import factory.entity.abtractproduct.ISofa;

public class VictorianSofa implements ISofa {
    @Override
    public void lieOn() {
        System.out.println("Lied on a victorian sofa");
    }
}
