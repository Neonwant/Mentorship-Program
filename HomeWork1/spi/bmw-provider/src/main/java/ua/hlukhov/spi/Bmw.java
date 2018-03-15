package ua.hlukhov.spi;

@Provider
public class Bmw implements Car {
    @Override
    public String getName() {
        return "Bmw";
    }
}
