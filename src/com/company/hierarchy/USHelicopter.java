package com.company.hierarchy;

//Американский вертолет при атаке ракетами только атакует ракетами (без доп. эффектов)
public class USHelicopter extends Vehicle {

    private int rocketDMG;

    public int getRocketDMG() {
        return rocketDMG;
    }

    public void setRocketDMG(int rocketDMG) {
        this.rocketDMG = rocketDMG;
    }

    public USHelicopter(String name, int hp, int cost, int dps, int armor, int rocketDMG) {
        super(name, hp, cost, dps, armor);
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
