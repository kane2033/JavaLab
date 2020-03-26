package com.company.hierarchy;

import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;

public class Soldier extends AbstractUnit {

    private int stamina;
    private Grenade grenade;

    public Soldier(String name, int hp, int cost, int dps, int stamina, Weapon weapon, Grenade grenade) {
        super(name, hp, cost, dps, weapon);
        this.stamina = stamina;
        this.grenade = grenade;
    }

    public Soldier() {
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Stamina = " + getStamina());

    }
}
