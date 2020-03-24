package com.company;

import com.company.decorator.*;
import com.company.factoryMethod.*;
import com.company.hierarchy.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<AbstractUnit> units = new ArrayList<>();
        int classesAmount = 4; //количество вариантов
        int unitsAmount = 2; //количество производимых юнитов
        for (int i = 0; i < unitsAmount; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, classesAmount);
            RUSArmyFactory rusFactory = new RUSArmyFactory();
            USArmyFactory usFactory = new USArmyFactory();

            switch (random) {
                case (0):
                    //(можно ли пользоваться явным преобразованием?)
                    Soldier rusCommander = (Soldier)rusFactory.createUnit(UnitType.COMMANDER); //создаем фабричным методом
                    rusCommander = new EmpoweredAmmo(rusCommander); //декорируем
                    units.add(rusCommander); //добавляем
                    break;
                case (1):
                    Soldier usScavenger = (Soldier)usFactory.createUnit(UnitType.SCAVENGER);
                    usScavenger = new StaminaBooster(usScavenger);
                    units.add(usScavenger);
                    break;
                case(2):
                    Vehicle rusHelicopter = (Vehicle)rusFactory.createUnit(UnitType.HELICOPTER);
                    rusHelicopter = new TitanicArmor(rusHelicopter);
                    units.add(rusHelicopter);
                    break;
                case(3):
                    Vehicle usMedicalStation = (Vehicle)usFactory.createUnit(UnitType.MEDICAL_STATION);
                    units.add(usMedicalStation);
                    break;
            }
        }
        for (AbstractUnit unit:units) { //отображает всех сделанных юнитов
            unit.ShowInfo();
            System.out.println();
        }
    }
}
