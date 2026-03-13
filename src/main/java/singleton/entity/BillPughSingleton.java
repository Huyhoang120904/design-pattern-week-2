package singleton.entity;

public class BillPughSingleton {
    private static class BillPughSingletonHelper {
        static final BillPughSingleton INSTANCE= new BillPughSingleton();
    }

    private BillPughSingleton(){}

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.INSTANCE;
    }
}
