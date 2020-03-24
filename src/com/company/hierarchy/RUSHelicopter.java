package com.company.hierarchy;

//Русский вертолет при атаке ракетами увеличивает себе броню
public class RUSHelicopter extends Vehicle {

    private int rocketDMG;
    private int armorBuff;

    public RUSHelicopter(String name, int hp, int cost, int dps, int armor, int rocketDMG, int armorBuff) {
        super(name, hp, cost, dps, armor);
        this.rocketDMG = rocketDMG;
        this.armorBuff = armorBuff;
    }

    public int getRocketDMG() {
        return rocketDMG;
    }

    public void setRocketDMG(int rocketDMG) {
        this.rocketDMG = rocketDMG;
    }

    public int getArmorBuff() {
        return armorBuff;
    }

    public void setArmorBuff(int armorBuff) {
        this.armorBuff = armorBuff;
    }

    public void RocketBarrage() {
        setDps(getDps() * rocketDMG);
        setArmor(getArmor() + armorBuff);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Rocket DMG = " + getRocketDMG() + ", Armor buff = " + getArmorBuff());
    }
}
