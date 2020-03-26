package com.company.hierarchy;

import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;

// Американский командир может увеличивать урон
public class USCommander extends Soldier {

    private int dpsBuff;

    public USCommander(String name, int hp, int cost, int dps, int stamina, int dpsBuff, Weapon weapon, Grenade grenade) {
        super(name, hp, cost, dps, stamina, weapon, grenade);
        this.dpsBuff = dpsBuff;
    }

    public int getDpsBuff() {
        return dpsBuff;
    }

    public void setDpsBuff(int dpsBuff) {
        this.dpsBuff = dpsBuff;
    }

    public void Buff(AbstractUnit unit) {
        unit.setDps(unit.getDps() + dpsBuff);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("DPS Buff = " + getDpsBuff());
    }
}
