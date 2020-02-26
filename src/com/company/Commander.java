package com.company;

public class Commander extends Soldier {

    int hpBuff;
    int dpsBuff;

    public Commander(int hp, int cost, int dps, int stamina, int hpBuff, int dpsBuff) {
        super(hp, cost, dps, stamina);
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
}
