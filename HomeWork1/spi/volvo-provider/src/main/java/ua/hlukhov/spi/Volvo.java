package ua.hlukhov.spi;

@Provider
public class Volvo implements Car {

    @Override
    public String getName() {
        return "Volvo";
    }
}
