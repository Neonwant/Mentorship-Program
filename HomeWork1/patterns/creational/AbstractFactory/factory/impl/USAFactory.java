package pattern.AbstractFactory.factory.impl;

import pattern.AbstractFactory.factory.interfaces.TransportFactory;
import pattern.AbstractFactory.transport.impl.Porsche;
import pattern.AbstractFactory.transport.impl.aircraft.Boeing747;
import pattern.AbstractFactory.transport.interfaces.Aircraft;
import pattern.AbstractFactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
