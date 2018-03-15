package pattern.AbstractFactory.transport.impl.aircraft;

import pattern.AbstractFactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("TU134 flight!");
    }
}
