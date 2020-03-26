package com.company.factoryMethod;

import com.company.abstractFactory.*;
import com.company.abstractFactory.components.Fuel;
import com.company.abstractFactory.components.Grenade;
import com.company.abstractFactory.components.Weapon;
import com.company.hierarchy.*;

//Русская фабрика отличается увеличенными характеристиками здоровья,
//выносливости и брони
public class RUSArmyFactory extends ArmyFactory {

    public RUSArmyFactory() {
        soldierFactory = new RUSSoldierFactory();
        vehicleFactory = new RUSVehicleFactory();
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
                unit = new RUSCommander("RUS Commander", 35, 20, 5, 10, 5, soldierWeapon, grenade);
                break;
            case SCAVENGER:
                unit = new Scavenger("RUS Scavenger", 40, 15, 10, 15, 2, soldierWeapon, grenade);
                break;
            case HELICOPTER:
                unit = new RUSHelicopter("RUS Helicopter", 70, 40, 15, 25, 2, 10, vehicleWeapon, fuel);
                break;
            case MEDICAL_STATION:
                unit = new MedicalStation("RUS Medical Station", 45, 40, 2, 15, 15, vehicleWeapon, fuel);
                break;
        }
        return unit;
    }
}
