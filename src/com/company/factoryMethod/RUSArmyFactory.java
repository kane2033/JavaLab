package com.company.factoryMethod;

import com.company.hierarchy.*;

//Русская фабрика отличается увеличенными характеристиками здоровья,
//выносливости и брони
public class RUSArmyFactory extends ArmyFactory {

    @Override
    public AbstractUnit createUnit(UnitType type) {
        AbstractUnit unit = null;
        switch(type) {
            case COMMANDER:
                unit = new RUSCommander("RUS Commander", 35, 20, 5, 10, 5);
                break;
            case SCAVENGER:
                unit = new Scavenger("RUS Scavenger", 40, 15, 10, 15, 2);
                break;
            case HELICOPTER:
                unit = new RUSHelicopter("RUS Helicopter", 70, 40, 15, 25, 2, 10);
                break;
            case MEDICAL_STATION:
                unit = new MedicalStation("RUS Medical Station", 45, 40, 2, 15, 15);
                break;
        }
        return unit;
    }
}
