package factory.entity.concretefactory;

import factory.entity.abstractfactory.FunitureFactory;
import factory.entity.abtractproduct.IChair;
import factory.entity.abtractproduct.ICoffeeTable;
import factory.entity.abtractproduct.ISofa;
import factory.entity.concreteproduct.VictorianChair;
import factory.entity.concreteproduct.VictorianCoffeeTable;
import factory.entity.concreteproduct.VictorianSofa;

public class VisctorianFunitureFactory implements FunitureFactory {
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }
}
