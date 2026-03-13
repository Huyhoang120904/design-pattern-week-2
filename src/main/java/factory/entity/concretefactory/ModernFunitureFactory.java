package factory.entity.concretefactory;

import factory.entity.abstractfactory.FunitureFactory;
import factory.entity.abtractproduct.IChair;
import factory.entity.abtractproduct.ICoffeeTable;
import factory.entity.abtractproduct.ISofa;
import factory.entity.concreteproduct.ModernChair;
import factory.entity.concreteproduct.ModernCoffeeTable;
import factory.entity.concreteproduct.ModernSofa;

public class ModernFunitureFactory implements FunitureFactory {
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }
}
