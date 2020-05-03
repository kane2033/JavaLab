package com.company.factoryMethod;

import com.company.abstractFactory.USSoldierFactory;
import com.company.abstractFactory.USVehicleFactory;
import com.company.hierarchy.*;

//Американская фабрика отличается высокими показателями урона
public class USArmyFactory extends ArmyFactory {

    public USArmyFactory() {
        soldierFactory = new USSoldierFactory();
        vehicleFactory = new USVehicleFactory();
        createEquipment();
    }

    @Override
    public AbstractUnit createUnit(UnitType type) {
        AbstractUnit unit = null;
        switch(type) {
            case COMMANDER:
                unit = new USCommander("US Commander", 25, 20, 15, 5, 10,
                        soldierEquipment.getWeapon(), soldierEquipment.getGrenade());
                break;
            case SCAVENGER:
                unit = new Scavenger("US Scavenger", 30, 15, 20, 10, 4,
                        soldierEquipment.getWeapon(), soldierEquipment.getGrenade());
                break;
            case HELICOPTER:
                unit = new USHelicopter("US Helicopter", 60, 40, 25, 15, 4,
                        vehicleEquipment.getWeapon(), vehicleEquipment.getFuel());
                break;
            case MEDICAL_STATION:
                unit = new MedicalStation("US Medical Station", 35, 40, 8, 5, 20,
                        vehicleEquipment.getWeapon(), vehicleEquipment.getFuel());
                break;
        }
        return unit;
    }
}
