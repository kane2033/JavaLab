package com.company;

public class Soldier extends AbstractUnit {

    protected int stamina;

    public Soldier(String name, int hp, int cost, int dps, int stamina) {
        super(name, hp, cost, dps);
        this.stamina = stamina;
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
