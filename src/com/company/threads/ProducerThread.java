package com.company.threads;

import com.company.decorator.EmpoweredAmmo;
import com.company.decorator.StaminaBooster;
import com.company.decorator.TitanicArmor;
import com.company.factoryMethod.RUSArmyFactory;
import com.company.factoryMethod.USArmyFactory;
import com.company.factoryMethod.UnitType;
import com.company.hierarchy.AbstractUnit;
import com.company.hierarchy.Soldier;
import com.company.hierarchy.Vehicle;

import java.util.concurrent.ThreadLocalRandom;

public class ProducerThread extends Thread {

    //фабрики для создания юнита
    private RUSArmyFactory rusFactory = new RUSArmyFactory();
    private USArmyFactory usFactory = new USArmyFactory();

    private UnitsStorage storage; //хранилище, в которое будем класть юниты

    public ProducerThread(UnitsStorage storage) {
        super("Поток производителя"); //название потока
        this.storage = storage;
    }

    //создает случайного юнита и добавляет в список
    private AbstractUnit createRandomUnit() {

        int random = ThreadLocalRandom.current().nextInt(0, 3);
        AbstractUnit unit = null;

        switch (random) {
            case (0):
                //(можно ли пользоваться явным преобразованием?)
                Soldier rusCommander = (Soldier) rusFactory.createUnit(UnitType.COMMANDER); //создаем фабричным методом
                //в фабричном методе используется абстрактная фабрика
                rusCommander = new EmpoweredAmmo(rusCommander); //декорируем
                unit = rusCommander; //добавляем
                break;
            case (1):
                Soldier usScavenger = (Soldier) usFactory.createUnit(UnitType.SCAVENGER);
                usScavenger = new StaminaBooster(usScavenger);
                unit = usScavenger;
                break;
            case (2):
                Vehicle rusHelicopter = (Vehicle) rusFactory.createUnit(UnitType.HELICOPTER);
                rusHelicopter = new TitanicArmor(rusHelicopter);
                unit = rusHelicopter;
                break;
            case (3):
                Vehicle usMedicalStation = (Vehicle) usFactory.createUnit(UnitType.MEDICAL_STATION);
                unit = usMedicalStation;
                break;
        }
        return unit;
    }

    @Override
    public void run() {
        System.out.println("Поток производителя запущен");

        while (true) { //бесконечно создает юниты и кладет на склад
            storage.put(createRandomUnit());
        }
    }
}
