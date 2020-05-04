package com.company.abstractFactory.equipment;

import com.company.abstractFactory.builder.VehicleEquipmentBuilder;
import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Weapon;

//транспорту в снаряжение выдается топливо
public class VehicleEquipment extends Equipment {
    private Fuel fuel = null;

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public VehicleEquipment(Weapon weapon, Fuel fuel) {
        this.setWeapon(weapon);
        this.fuel = fuel;
    }

    public VehicleEquipment() {

    }

    public static VehicleEquipmentBuilder builder;
}
