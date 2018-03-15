package pattern.AbstractFactory.factory.impl;

import pattern.AbstractFactory.factory.interfaces.TransportFactory;
import pattern.AbstractFactory.transport.impl.Niva;
import pattern.AbstractFactory.transport.impl.aircraft.TU134;
import pattern.AbstractFactory.transport.interfaces.Aircraft;
import pattern.AbstractFactory.transport.interfaces.Car;

public class UkrainianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
