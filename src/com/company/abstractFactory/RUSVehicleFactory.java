package com.company.abstractFactory;

import com.company.abstractFactory.components.*;

public class RUSVehicleFactory implements VehicleFactory {
    @Override
    public Weapon addWeapon() {
        return new FalangaM();
    }

    @Override
    public Fuel addFuel() {
        return new RUSDiesel();
    }
}
