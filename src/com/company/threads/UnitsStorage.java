package com.company.threads;

import com.company.hierarchy.AbstractUnit;

import java.util.Stack;

//класс "Хранилище", содержащий произведенные товары
public class UnitsStorage {

    private int unitsAmount = 0;
    private int maxUnits;

    private Stack<AbstractUnit> units = new Stack<>();

    public UnitsStorage(int maxUnits) {
        this.maxUnits = maxUnits;
    }

    //потребитель берет товар со склада
    public synchronized AbstractUnit get() {
        while (unitsAmount <= 0) { //если склад пуст
            try {
                wait(); //ждем, когда производитель добавит товар
            }
            catch (InterruptedException e) {
                System.out.println("Ошибка при ожидании новых товаров (get)");
            }
        }
        unitsAmount--;
        System.out.println("Потребитель взял 1 юнит");
        System.out.println("Юнитов на складе: " + unitsAmount);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка в sleep get");
        }

        notify(); //сигнал производителю
        return units.pop(); //возврат нового юнита потребителю
    }

    //потребитель пополняет склад новыми юнитами
    public synchronized void put(AbstractUnit newUnit) {
        while (unitsAmount >= maxUnits) { //если склад переполнен
            try {
                wait(); //ждем, когда потребитель освободит склад
            }
            catch (InterruptedException e) {
                System.out.println("Ошибка при ожидании потребления товаров (put)");
            }
        }
        unitsAmount++;
        units.push(newUnit); //добавляем в склад
        System.out.println("Производитель добавил 1 юнит");
        System.out.println("Юнитов на складе: " + unitsAmount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка в sleep put");
        }
        notify(); //сигнал потребителю
    }
}
