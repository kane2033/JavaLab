package com.company;

import java.util.List;

public class Vehicle extends  AbstractUnit {

    int armor;
    List<Soldier> soldiers;

    public Vehicle(int hp, int cost, int dps, int armor) {
        super(hp, cost, dps);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

}
