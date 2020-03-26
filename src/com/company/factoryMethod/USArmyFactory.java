package com.company.factoryMethod;

import com.company.abstractFactory.USSoldierFactory;
import com.company.abstractFactory.USVehicleFactory;
import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;
import com.company.hierarchy.*;

//Американская фабрика отличается высокими показателями урона
public class USArmyFactory extends ArmyFactory {

    public USArmyFactory() {
        soldierFactory = new USSoldierFactory();
        vehicleFactory = new USVehicleFactory();
    }

    @Override
    public AbstractUnit createUnit(UnitType type) {
        AbstractUnit unit = null;
        //снаряжение в соответствие со страной
        //применение абстрактной фабрики
        Weapon soldierWeapon = soldierFactory.addWeapon();
        Grenade grenade = soldierFactory.addGrenade();
        Weapon vehicleWeapon = vehicleFactory.addWeapon();
        Fuel fuel = vehicleFactory.addFuel();
        switch(type) {
            case COMMANDER:
                unit = new USCommander("US Commander", 25, 20, 15, 5, 10, soldierWeapon, grenade);
                break;
            case SCAVENGER:
                unit = new Scavenger("US Scavenger", 30, 15, 20, 10, 4, soldierWeapon, grenade);
                break;
            case HELICOPTER:
                unit = new USHelicopter("US Helicopter", 60, 40, 25, 15, 4, vehicleWeapon, fuel);
                break;
            case MEDICAL_STATION:
                unit = new MedicalStation("US Medical Station", 35, 40, 8, 5, 20, vehicleWeapon, fuel);
                break;
        }
        return unit;
    }
}
