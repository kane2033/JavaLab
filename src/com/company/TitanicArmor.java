package com.company;

public class TitanicArmor extends VehicleDecorator {

    private Vehicle vehicle;

    private int armorBuff = 10;

    public TitanicArmor(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.vehicle.setArmor(this.vehicle.getArmor() + armorBuff);
    }

    @Override
    public void ShowInfo() {
        vehicle.ShowInfo();
        System.out.println("Titanic armor applied! Armor increased by " + armorBuff + ", current armor = " + vehicle.getArmor());
    }
}
