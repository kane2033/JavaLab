package com.company;

public class Soldier extends AbstractUnit {

    protected int stamina;

    public Soldier(int hp, int cost, int dps, int stamina) {
        super(hp, cost, dps);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
