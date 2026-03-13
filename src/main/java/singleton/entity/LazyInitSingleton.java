package singleton.entity;

public class LazyInitSingleton {
    private static String instance;

    private LazyInitSingleton(){}

    private static String getInstance(){
        if (instance == null) {
            instance = "Hello world!";
        }
        return instance;
    }
}
