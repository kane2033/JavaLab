package com.company;

public class Scavenger extends Soldier {

    int lootModifier;

    public Scavenger(int hp, int cost, int dps, int stamina, int lootModifier) {
        super(hp, cost, dps, stamina);
        this.lootModifier = lootModifier;
    }

    public int getLootModifier() {
        return lootModifier;
    }

    public void setLootModifier(int lootModifier) {
        this.lootModifier = lootModifier;
    }

    public void Loot(AbstractUnit unit) {
        this.setDps(this.getDps() + lootModifier);
    }
}
