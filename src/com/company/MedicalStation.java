package com.company;

public class MedicalStation extends Vehicle{

    private int healPower;

    public MedicalStation(String name, int hp, int cost, int dps, int armor, int healPower) {
        super(name, hp, cost, dps, armor);
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
