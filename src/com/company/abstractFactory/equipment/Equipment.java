package com.company.abstractFactory.equipment;

import com.company.abstractFactory.components.Weapon;

//класс снаряжения - у всех юнитов есть оружие
public abstract class Equipment {
    private Weapon weapon = null;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
