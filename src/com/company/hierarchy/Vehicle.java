package com.company.hierarchy;

import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Vehicle extends  AbstractUnit {

    private int armor;
    private List<Soldier> soldiers = new ArrayList<>();
    private Fuel fuel;

    public Vehicle(String name, int hp, int cost, int dps, int armor, Weapon weapon, Fuel fuel) {
        super(name, hp, cost, dps, weapon);
        this.armor = armor;
        this.fuel = fuel;
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
