package com.company.abstractFactory.equipment;

import com.company.abstractFactory.builder.SoldierEquipmentBuilder;
import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;

//солдатам в снаряжение выдается граната
public class SoldierEquipment extends Equipment {
    private Grenade grenade = null;

    public Grenade getGrenade() {
        return grenade;
    }

    public void setGrenade(Grenade grenade) {
        this.grenade = grenade;
    }

    public SoldierEquipment(Weapon weapon, Grenade grenade) {
        this.setWeapon(weapon);
        this.grenade = grenade;
    }

    public SoldierEquipment() {

    }

    //статический класс строителя
    public static SoldierEquipmentBuilder builder;

}
