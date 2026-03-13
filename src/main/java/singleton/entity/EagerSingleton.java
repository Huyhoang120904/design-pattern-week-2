package singleton.entity;

public class EagerSingleton {
    private static String instance = "Hello word!";

    private EagerSingleton() {}

    public static String getInstance() {
        return instance;
    }
}
