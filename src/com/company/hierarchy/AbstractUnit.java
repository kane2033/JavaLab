package com.company.hierarchy;

public abstract class AbstractUnit {

    private String name = "Unit";
    private int hp = 1;
    private int cost = 1;
    private int dps = 1;

    AbstractUnit(String name, int hp, int cost, int dps) {
        this.name = name;
        this.hp = hp;
        this.cost = cost;
        this.dps = dps;
    }

    AbstractUnit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void ShowInfo() {
        System.out.println("Name = " + getName());
        System.out.println("HP = " + getHp());
        System.out.println("DPS = " + getDps());
        System.out.println("Cost = " + getCost());
    }
}
