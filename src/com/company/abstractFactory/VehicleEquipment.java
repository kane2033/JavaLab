package com.company.abstractFactory;

import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Weapon;

public class VehicleEquipment {
    private Weapon weapon = null;
    private Fuel fuel = null;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public VehicleEquipment(Weapon weapon, Fuel fuel) {
        this.weapon = weapon;
        this.fuel = fuel;
    }

    public VehicleEquipment() {

    }
}
