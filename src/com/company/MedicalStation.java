package com.company;

public class MedicalStation extends Vehicle{

    int healPower;

    public MedicalStation(int hp, int cost, int dps, int armor, int healPower) {
        super(hp, cost, dps, armor);
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
}
