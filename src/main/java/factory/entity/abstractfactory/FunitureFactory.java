package factory.entity.abstractfactory;

import factory.entity.abtractproduct.IChair;
import factory.entity.abtractproduct.ICoffeeTable;
import factory.entity.abtractproduct.ISofa;

public interface FunitureFactory {

    IChair createChair();
    ICoffeeTable createCoffeeTable();
    ISofa createSofa();

}
