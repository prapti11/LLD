package DesignPatterns.Prototype;
import java.util.HashMap;
import java.util.Map;


// To store prototype of commonly accessed objects and which will be used further to create copy objects
public class Registry<E> {

    private Map<String, E> map = new HashMap<>();

    void register(String key, E value){
        map.put(key,value);
    }
    E get(String key){
        return map.get(key);
    }
}
