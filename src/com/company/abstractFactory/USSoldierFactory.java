package com.company.abstractFactory;

import com.company.abstractFactory.components.*;

public class USSoldierFactory implements SoldierFactory {

    @Override
    public Weapon addWeapon() {
        return new M4A1();
    }

    @Override
    public Grenade addGrenade() {
        return new M67();
    }
}
