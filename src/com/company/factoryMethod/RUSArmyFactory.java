package com.company.factoryMethod;

import com.company.abstractFactory.*;
import com.company.hierarchy.*;

//Русская фабрика отличается увеличенными характеристиками здоровья,
//выносливости и брони
public class RUSArmyFactory extends ArmyFactory {

    public RUSArmyFactory() {
        soldierFactory = new RUSSoldierFactory();
        vehicleFactory = new RUSVehicleFactory();
        createEquipment(); //создание обмундирования с помощью фабрик
    }

    @Override
    public AbstractUnit createUnit(UnitType type) {
        AbstractUnit unit = null;
        switch(type) {
            case COMMANDER:
                unit = new RUSCommander("RUS Commander", 35, 20, 5, 10, 5,
                        soldierEquipment.getWeapon(), soldierEquipment.getGrenade());
                break;
            case SCAVENGER:
                unit = new Scavenger("RUS Scavenger", 40, 15, 10, 15, 2,
                        soldierEquipment.getWeapon(), soldierEquipment.getGrenade());
                break;
            case HELICOPTER:
                unit = new RUSHelicopter("RUS Helicopter", 70, 40, 15, 25, 2, 10,
                        vehicleEquipment.getWeapon(), vehicleEquipment.getFuel());
                break;
            case MEDICAL_STATION:
                unit = new MedicalStation("RUS Medical Station", 45, 40, 2, 15, 15,
                        vehicleEquipment.getWeapon(), vehicleEquipment.getFuel());
                break;
        }
        return unit;
    }
}
