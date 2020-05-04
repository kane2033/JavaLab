package com.company.abstractFactory.builder;

import com.company.abstractFactory.components.AK_74M;
import com.company.abstractFactory.components.F1;

//строитель русского обмундирования для солдат
public class RUSSoldierEquipmentBuilder extends SoldierEquipmentBuilder {

    public RUSSoldierEquipmentBuilder() {
    }

    //задаем русское снаряжение
    @Override
    public SoldierEquipmentBuilder withWeapon() {
        setWeapon(new AK_74M());
        return this;
    }

    @Override
    public SoldierEquipmentBuilder withGrenade() {
        setGrenade(new F1());
        return this;
    }
}
