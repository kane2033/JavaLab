package com.company.factoryMethod;

import com.company.abstractFactory.equipment.SoldierEquipment;
import com.company.abstractFactory.equipment.VehicleEquipment;
import com.company.abstractFactory.VehicleFactory;
import com.company.hierarchy.AbstractUnit;

public abstract class ArmyFactory {

    protected abstract AbstractUnit createUnit(UnitType type);

    //protected SoldierFactory soldierFactory; -> заменено на строителя
    protected VehicleFactory vehicleFactory;
    protected SoldierEquipment soldierEquipment;
    protected VehicleEquipment vehicleEquipment;

    protected void createEquipment() {
        //снаряжение в соответствие со страной
        //soldierEquipment = soldierFactory.makeEquipment(); -> заменено на строителя
        //статический класс строителя в классе снаряжения выдает оружие и гранату
        soldierEquipment = (SoldierEquipment) new SoldierEquipment().builder.withWeapon().withGrenade().build();
        //применение абстрактной фабрики
        vehicleEquipment = vehicleFactory.makeEquipment();
    }

    /**
     * Тут могут быть методы операций по созданию объектов
     * (пример: три метода готовки кофе: перемалывание, готовка, наливаем в кружку),
     * но для данной иерархии они не предусмотрены
     * (на данный момент)
     */
}
