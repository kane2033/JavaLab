package com.company.abstractFactory.builder;

import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Weapon;
import com.company.abstractFactory.equipment.VehicleEquipment;

//снажярение для транспорта
//(не используется)
public abstract class VehicleEquipmentBuilder {
    private VehicleEquipment equipment;

    protected void setWeapon(Weapon weapon) {
        equipment.setWeapon(weapon);
    }

    protected void setFuel(Fuel fuel) {
        equipment.setFuel(fuel);
    }

    public VehicleEquipmentBuilder() {
        equipment = new VehicleEquipment();
    }

    public abstract VehicleEquipmentBuilder withWeapon(Weapon weapon);

    public abstract VehicleEquipmentBuilder withGrenade(Fuel fuel);

    public VehicleEquipment build() {
        return equipment;
    }
}
