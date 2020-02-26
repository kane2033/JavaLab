package com.company;

public abstract class AbstractUnit {

    protected int hp;
    protected int cost;
    protected int dps;

    public AbstractUnit(int hp, int cost, int dps) {
        this.hp = hp;
        this.cost = cost;
        this.dps = dps;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public void Attack(AbstractUnit unit) {
        unit.setHp(unit.getHp() - this.getDps());
    }
}
