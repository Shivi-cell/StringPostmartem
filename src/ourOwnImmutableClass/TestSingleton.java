package ourOwnImmutableClass;

class Singleton {
    private static Singleton t;
    private Singleton(){

    }
    public static Singleton createObject(){
        if (t == null)
            t = new Singleton();
        return t;
    }
}

public class TestSingleton  {
    public static void main(String[] args) {
        Singleton singleton = Singleton.createObject();
        Singleton singleton1 = Singleton.createObject();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}