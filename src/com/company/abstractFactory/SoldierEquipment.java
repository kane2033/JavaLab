package com.company.abstractFactory;

import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;

public class SoldierEquipment {
    private Weapon weapon = null;
    private Grenade grenade = null;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Grenade getGrenade() {
        return grenade;
    }

    public void setGrenade(Grenade grenade) {
        this.grenade = grenade;
    }

    public SoldierEquipment(Weapon weapon, Grenade grenade) {
        this.weapon = weapon;
        this.grenade = grenade;
    }

    public SoldierEquipment() {

    }

}
