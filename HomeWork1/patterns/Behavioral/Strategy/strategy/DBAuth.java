package pattern.Strategy.strategy;

public class DBAuth implements AuthStrategy {

    private Object dbRef; // reference to DB
    private String dbUrl;

    public DBAuth(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void createConnection() {
        // dbRef = ...
    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with DB...");

        String userHash = getHash(name);
        String passHash = getHash(password);

        return checkUser(userHash, passHash);
    }

    private String getHash(String value) {
        // hashing
        return "2A4DA31FR25";
    }

    private boolean checkUser(String name, String password) {
        // Checking in DB via dbRef...

        return true;
    }
}
