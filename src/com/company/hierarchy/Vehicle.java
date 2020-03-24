package com.company.hierarchy;

import java.util.ArrayList;
import java.util.List;

public class Vehicle extends  AbstractUnit {

    private int armor;
    private List<Soldier> soldiers = new ArrayList<>();

    public Vehicle(String name, int hp, int cost, int dps, int armor) {
        super(name, hp, cost, dps);
        this.armor = armor;
    }

    public Vehicle() {
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public List<Soldier> getSoldiers() {
        if (soldiers.isEmpty())
            return null;
        else
            return soldiers;
    }

    public int getSoldiersAmount() {
        if (soldiers.isEmpty()) {
            return 0;
        }
        else return soldiers.size();
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Armor = " + getArmor());
        System.out.println("Soldiers in vehicle = " + getSoldiersAmount());
    }

}
