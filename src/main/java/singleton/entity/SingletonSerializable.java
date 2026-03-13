package singleton.entity;

import java.io.Serializable;

public class SingletonSerializable implements Serializable{
    private static class SingletonSerializableHelper {
        static final SingletonSerializable INSTANCE= new SingletonSerializable();
    }

    private SingletonSerializable(){}

    public Object getInstance() {
        return SingletonSerializableHelper.INSTANCE;
    }


}
