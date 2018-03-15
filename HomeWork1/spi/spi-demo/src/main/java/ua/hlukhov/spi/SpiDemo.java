package ua.hlukhov.spi;

import java.util.ServiceLoader;

public class SpiDemo {

    public static void main(String[] args) {
        ServiceLoader<Car> services = ServiceLoader.load(Car.class);
        services.forEach(e ->
            System.out.println(e.getName())
        );
    }
}
