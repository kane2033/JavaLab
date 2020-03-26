package com.company.hierarchy;

import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Weapon;

//Американский вертолет при атаке ракетами только атакует ракетами (без доп. эффектов)
public class USHelicopter extends Vehicle {

    private int rocketDMG;

    public int getRocketDMG() {
        return rocketDMG;
    }

    public void setRocketDMG(int rocketDMG) {
        this.rocketDMG = rocketDMG;
    }

    public USHelicopter(String name, int hp, int cost, int dps, int armor, int rocketDMG, Weapon weapon, Fuel fuel) {
        super(name, hp, cost, dps, armor, weapon, fuel);
        this.rocketDMG = rocketDMG;
    }

    public void RocketBarrage() {
        setDps(getDps() * rocketDMG);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Rocket DMG = " + getRocketDMG());
    }
}
