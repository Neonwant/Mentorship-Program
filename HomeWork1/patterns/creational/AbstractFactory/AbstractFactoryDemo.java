package pattern.AbstractFactory;

import pattern.AbstractFactory.factory.impl.UkrainianFactory;
import pattern.AbstractFactory.factory.interfaces.TransportFactory;
import pattern.AbstractFactory.transport.interfaces.Aircraft;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        TransportFactory ukrainianFactory = new UkrainianFactory();

        Aircraft aircraft = ukrainianFactory.createAircraft();

        aircraft.flight();

    }
}
