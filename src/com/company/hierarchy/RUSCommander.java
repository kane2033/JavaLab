package com.company.hierarchy;

import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;

// Русский командир может увеличивать здоровье
public class RUSCommander extends Soldier {

    private int hpBuff;

    public RUSCommander(String name, int hp, int cost, int dps, int stamina, int hpBuff, Weapon weapon, Grenade grenade) {
        super(name, hp, cost, dps, stamina, weapon, grenade);
        this.hpBuff = hpBuff;
    }

    public int getHpBuff() {
        return hpBuff;
    }

    public void setHpBuff(int hpBuff) {
        this.hpBuff = hpBuff;
    }

    public void BuffHP(AbstractUnit unit) {
        unit.setHp(unit.getHp() + hpBuff);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("HP Buff = " + getHpBuff());
    }
}
