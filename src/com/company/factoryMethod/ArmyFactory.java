package com.company.factoryMethod;

import com.company.abstractFactory.SoldierEquipment;
import com.company.abstractFactory.SoldierFactory;
import com.company.abstractFactory.VehicleEquipment;
import com.company.abstractFactory.VehicleFactory;
import com.company.hierarchy.AbstractUnit;

public abstract class ArmyFactory {


    protected abstract AbstractUnit createUnit(UnitType type);

    protected SoldierFactory soldierFactory;
    protected VehicleFactory vehicleFactory;
    protected SoldierEquipment soldierEquipment;
    protected VehicleEquipment vehicleEquipment;

    protected void createEquipment() {
        //снаряжение в соответствие со страной
        //применение абстрактной фабрики
        soldierEquipment = soldierFactory.makeEquipment();
        vehicleEquipment = vehicleFactory.makeEquipment();
    }

    /**
     * Тут могут быть методы операций по созданию объектов
     * (пример: три метода готовки кофе: перемалывание, готовка, наливаем в кружку),
     * но для данной иерархии они не предусмотрены
     * (на данный момент)
     */
}
