package com.company;

import com.company.decorator.EmpoweredAmmo;
import com.company.decorator.StaminaBooster;
import com.company.decorator.TitanicArmor;
import com.company.factoryMethod.RUSArmyFactory;
import com.company.factoryMethod.USArmyFactory;
import com.company.factoryMethod.UnitType;
import com.company.hierarchy.AbstractUnit;
import com.company.hierarchy.Soldier;
import com.company.hierarchy.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerThread extends Thread {

    private Stack<AbstractUnit> units = new Stack<>();

    private RUSArmyFactory rusFactory = new RUSArmyFactory();
    private USArmyFactory usFactory = new USArmyFactory();

    private AtomicInteger unitsAmount = new AtomicInteger(0);

    public int getUnitsAmount() {
        return unitsAmount.get();
    }

    public int decrementUnitsAmount() {
        return unitsAmount.decrementAndGet();
    }

    public AbstractUnit getUnit() {
        System.out.println("Минус юнит, количество: " + decrementUnitsAmount());
        return units.pop();
    }

    public ProducerThread() {
        super("Поток производителя"); //название потока
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


    public void run() {
        System.out.println("Поток производителя запущен");

        //создание первого юнита
        AbstractUnit newUnit = createRandomUnit();
        units.push(newUnit);
        unitsAmount.addAndGet(1);

        while (unitsAmount.get() > 0) {
            try { //создание случайного юнита
                newUnit = createRandomUnit();
                units.push(newUnit);

                System.out.println("Юнитов произведено на данный момент: " + unitsAmount.addAndGet(1));
                //newUnit.ShowInfo();

                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Поток производителя прерван");
            }
        }

    }
}
