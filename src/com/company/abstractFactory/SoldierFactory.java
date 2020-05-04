package com.company.abstractFactory;

import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;
import com.company.abstractFactory.equipment.SoldierEquipment;

//абстрактная фабрика
public interface SoldierFactory {
    Weapon addWeapon();
    Grenade addGrenade();
    default SoldierEquipment makeEquipment() {
        return new SoldierEquipment(addWeapon(), addGrenade());
    }
}
