package com.company.iterator;

import com.company.iterator.floors.FirstFloor;
import com.company.iterator.floors.SecondFloor;
import com.company.iterator.floors.ThirdFloor;
import com.company.iterator.iterators.Iterator;

//класс здания, содержащего этажи
public class Building {

    private String street;
    private int idBuilding;
    private String name;

    private FirstFloor firstFloor;
    private SecondFloor secondFloor;
    private ThirdFloor thirdFloor;

    public Building(String street, int idBuilding, String name,
                    FirstFloor firstFloor, SecondFloor secondFloor,
                    ThirdFloor thirdFloor) {
        this.street = street;
        this.idBuilding = idBuilding;
        this.name = name;
        this.firstFloor = firstFloor;
        this.secondFloor = secondFloor;
        this.thirdFloor = thirdFloor;
    }

    //метод отображение информации о здании и этажах
    public void showInfo() {
        System.out.println("Ул. " + street + " д." + idBuilding + ", Название: '" + name + "';");

        System.out.println("Информация о комнатах в доме:");
        System.out.println("Первый этаж:");
        showFloorInfo(firstFloor.createIterator());
        System.out.println("Второй этаж:");
        showFloorInfo(secondFloor.createIterator());
        System.out.println("Третий этаж:");
        showFloorInfo(thirdFloor.createIterator());
    }

    //метод отображения информации об этаже с помощью итератора
    private void showFloorInfo(Iterator iterator) {
        while (iterator.hasNext()) {
            Room room = (Room) iterator.next();
            room.showInfo();
        }
    }

}
