package com.company;

public class StaminaBooster extends  SoldierDecorator {

    private Soldier soldier;

    private int staminaBuff = 10;

    public StaminaBooster(Soldier soldier) {
        this.soldier = soldier;
        this.soldier.setStamina(this.soldier.getStamina() + staminaBuff);
    }

    @Override
    public void ShowInfo() {
        soldier.ShowInfo();
        System.out.println("Stamina booster applied! Stamina increased by " + staminaBuff + ", current stamina = " + soldier.getStamina());
    }
}
