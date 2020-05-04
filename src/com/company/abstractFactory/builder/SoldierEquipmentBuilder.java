package com.company.abstractFactory.builder;

import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;
import com.company.abstractFactory.equipment.Equipment;
import com.company.abstractFactory.equipment.SoldierEquipment;

//строитель снаряжения для солдат
public abstract class SoldierEquipmentBuilder {
    private SoldierEquipment equipment; //снаряжение

    public void setWeapon(Weapon weapon) {
        equipment.setWeapon(weapon);
    }

    public void setGrenade(Grenade grenade) {
        equipment.setGrenade(grenade);
    }

    public SoldierEquipmentBuilder() {
        equipment = new SoldierEquipment();
    }

    //"параметры конструктора"
    public abstract SoldierEquipmentBuilder withWeapon();

    public abstract SoldierEquipmentBuilder withGrenade();

    //"конструктор", который возвращает готовый объект
    public Equipment build() {
        return equipment;
    }
}
