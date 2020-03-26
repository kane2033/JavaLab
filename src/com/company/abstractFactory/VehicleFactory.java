package com.company.abstractFactory;

import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Weapon;

public interface VehicleFactory {
    Weapon addWeapon();
    Fuel addFuel();
}
