package com.company;

public class Commander extends Soldier {

    private int hpBuff;
    private int dpsBuff;

    public Commander(String name, int hp, int cost, int dps, int stamina, int hpBuff, int dpsBuff) {
        super(name, hp, cost, dps, stamina);
        this.hpBuff = hpBuff;
        this.dpsBuff = dpsBuff;
    }

    public int getHpBuff() {
        return hpBuff;
    }

    public void setHpBuff(int hpBuff) {
        this.hpBuff = hpBuff;
    }

    public int getDpsBuff() {
        return dpsBuff;
    }

    public void setDpsBuff(int dpsBuff) {
        this.dpsBuff = dpsBuff;
    }

    public void Buff(AbstractUnit unit) {
        unit.setHp(unit.getHp() + hpBuff);
        unit.setDps(unit.getDps() + dpsBuff);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("HP Buff = " + getHpBuff() + ", DPS Buff = " + getDpsBuff());
    }
}
