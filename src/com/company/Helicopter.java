package com.company;

public class Helicopter extends Vehicle {

    int rocketDMG;

    public int getRocketDMG() {
        return rocketDMG;
    }

    public void setRocketDMG(int rocketDMG) {
        this.rocketDMG = rocketDMG;
    }

    public Helicopter(int hp, int cost, int dps, int armor, int rocketDMG) {
        super(hp, cost, dps, armor);
        this.rocketDMG = rocketDMG;
    }

    public void RocketBarrage() {
        setDps(getDps() * rocketDMG);
    }
}
