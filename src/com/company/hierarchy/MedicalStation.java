package com.company.hierarchy;

import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Weapon;

public class MedicalStation extends Vehicle{

    private int healPower;

    public MedicalStation(String name, int hp, int cost, int dps, int armor, int healPower, Weapon weapon, Fuel fuel) {
        super(name, hp, cost, dps, armor, weapon, fuel);
        this.healPower = healPower;
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }

    public void Heal(AbstractUnit unit) {
        unit.setHp(unit.getHp() + healPower);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Heal Power = " + getHealPower());
    }
}
