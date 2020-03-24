package com.company.factoryMethod;

import com.company.hierarchy.*;

//Американская фабрика отличается высокими показателями урона
public class USArmyFactory extends ArmyFactory {

    @Override
    public AbstractUnit createUnit(UnitType type) {
        AbstractUnit unit = null;
        switch(type) {
            case COMMANDER:
                unit = new USCommander("US Commander", 25, 20, 15, 5, 10);
                break;
            case SCAVENGER:
                unit = new Scavenger("US Scavenger", 30, 15, 20, 10, 4);
                break;
            case HELICOPTER:
                unit = new USHelicopter("US Helicopter", 60, 40, 25, 15, 4);
                break;
            case MEDICAL_STATION:
                unit = new MedicalStation("US Medical Station", 35, 40, 8, 5, 20);
                break;
        }
        return unit;
    }
}
