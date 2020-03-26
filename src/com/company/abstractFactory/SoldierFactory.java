package com.company.abstractFactory;

import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;

//абстрактная фабрика
public interface SoldierFactory {
    Weapon addWeapon();
    Grenade addGrenade();
}
