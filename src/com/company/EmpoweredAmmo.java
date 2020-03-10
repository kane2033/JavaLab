package com.company;

public class EmpoweredAmmo extends SoldierDecorator {

    private Soldier soldier;

    private int dpsBuff = 10;

    public EmpoweredAmmo(Soldier soldier) {
        this.soldier = soldier;
        this.soldier.setDps(this.soldier.getDps() + dpsBuff);
        //this.soldier.setDps();
    }

    @Override
    public void ShowInfo() {
        soldier.ShowInfo();
        System.out.println("Empowered ammo applied! DPS increased by " + dpsBuff + ", current DPS = " + soldier.getDps());
    }
}
