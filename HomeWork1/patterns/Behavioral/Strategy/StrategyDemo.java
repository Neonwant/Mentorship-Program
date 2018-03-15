package pattern.Strategy;

import pattern.Strategy.auth.UserChecker;
import pattern.Strategy.strategy.DBAuth;
import pattern.Strategy.strategy.FileAuth;

import java.io.File;

public class StrategyDemo {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc://etc"));
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
    }
}
