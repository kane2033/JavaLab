package com.company.abstractFactory;

import com.company.abstractFactory.components.*;

public class RUSSoldierFactory implements SoldierFactory {
    @Override
    public Weapon addWeapon() {
        return new AK_74M();
    }

    @Override
    public Grenade addGrenade() {
        return new F1();
    }
}
