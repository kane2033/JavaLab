package com.company.abstractFactory.builder;


import com.company.abstractFactory.components.M4A1;
import com.company.abstractFactory.components.M67;

//строитель американского обмундирования для солдат
public class USSoldierEquipmentBuilder extends SoldierEquipmentBuilder {

    public USSoldierEquipmentBuilder() {

    }

    @Override
    public SoldierEquipmentBuilder withWeapon() {
        setWeapon(new M4A1());
        return this;
    }

    @Override
    public SoldierEquipmentBuilder withGrenade() {
        setGrenade(new M67());
        return this;
    }
}
