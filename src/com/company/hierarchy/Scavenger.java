package com.company.hierarchy;

public class Scavenger extends Soldier {

    private int lootModifier;

    public Scavenger(String name, int hp, int cost, int dps, int stamina, int lootModifier) {
        super(name, hp, cost, dps, stamina);
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

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Loot Modifier = " + getLootModifier());
    }

}
