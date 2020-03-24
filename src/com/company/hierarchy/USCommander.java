package com.company.hierarchy;

// Американский командир может увеличивать урон
public class USCommander extends Soldier {

    private int dpsBuff;

    public USCommander(String name, int hp, int cost, int dps, int stamina, int dpsBuff) {
        super(name, hp, cost, dps, stamina);
        this.dpsBuff = dpsBuff;
    }

    public int getDpsBuff() {
        return dpsBuff;
    }

    public void setDpsBuff(int dpsBuff) {
        this.dpsBuff = dpsBuff;
    }

    public void Buff(AbstractUnit unit) {
        unit.setDps(unit.getDps() + dpsBuff);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("DPS Buff = " + getDpsBuff());
    }
}
