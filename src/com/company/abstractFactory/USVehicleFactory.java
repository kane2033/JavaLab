package com.company.abstractFactory;

import com.company.abstractFactory.components.*;

public class USVehicleFactory implements VehicleFactory {
    @Override
    public Weapon addWeapon() {
        return new Tomahawk();
    }

    @Override
    public Fuel addFuel() {
        return new USDiesel();
    }
}
