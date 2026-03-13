package factory.entity.concreteproduct;

import factory.entity.abtractproduct.ISofa;

public class ModernSofa implements ISofa {
    @Override
    public void lieOn() {
        System.out.println("Lied on modern sofa");
    }
}
