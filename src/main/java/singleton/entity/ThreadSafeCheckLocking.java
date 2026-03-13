package singleton.entity;

public class ThreadSafeCheckLocking {
    private static volatile String instance;

    private ThreadSafeCheckLocking(){}

    public static synchronized String getInstance(){
        if (instance == null) {
            synchronized (String.class) {
                if (instance == null) {
                    instance = "Hello world!";
                }
            }
        }
        return instance;
    }



}
