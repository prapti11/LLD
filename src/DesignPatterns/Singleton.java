package DesignPatterns;
public class Singleton {
    int age;
    String name;
    static Singleton instance;

    private Singleton(int age, String name) {
        this.age = age;
        this.name=name;
    }

    // Version 1:
    public synchronized static Singleton getInstance1(){
        if(instance==null){ // T1 T2
            instance= new Singleton(10,"Prapti");
        }
        return instance;
    }
    // Version 2:
    public static Singleton getInstance2(){
        synchronized (Singleton.class){
            if(instance==null){ // T1 T2
                instance= new Singleton(10,"Prapti");
            }
        }

        return instance;
    }
}
