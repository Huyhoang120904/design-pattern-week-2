package singleton.entity;

public class ThreadSafeSingleton {
    private static volatile String instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized String getInstance() {
        if (instance == null) {
            instance = "Hello world!";
        }
        return instance;
    }

}
