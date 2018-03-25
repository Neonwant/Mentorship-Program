package pattern.Singleton;

public class Singleton {
    private static Singleton instance;

    // synchronized method is not good idea here
    // better use synchronized block (in case we really need synchronized sibgleton here
    // or create instance during field init
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {

    }

}
