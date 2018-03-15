package pattern.AbstractFactory.factory.interfaces;

import pattern.AbstractFactory.transport.interfaces.Aircraft;
import pattern.AbstractFactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();
    Aircraft createAircraft();

}
