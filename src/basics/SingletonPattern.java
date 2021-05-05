package basics;

public class SingletonPattern {
    public static String str;
    private static SingletonPattern instance;

    private SingletonPattern() {
    }

    static SingletonPattern getSingleInstance() {
        if(instance == null) {
            synchronized (SingletonPattern.class) {
                if(instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }
}
