package com.company.iterator;

import com.company.iterator.floors.FirstFloor;
import com.company.iterator.floors.SecondFloor;
import com.company.iterator.floors.ThirdFloor;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainIterator {

    public static void main(String[] args) {
        //заполнение здания информацией
        ArrayList<Room> firstFloorRooms = new ArrayList<>();
        firstFloorRooms.add(new Room(1, "Комната", 2));
        firstFloorRooms.add(new Room(2, "Комнатушка", 4));
        firstFloorRooms.add(new Room(3, "Комнатошка", 1));
        FirstFloor firstFloor = new FirstFloor(firstFloorRooms);

        LinkedList<Room> secondFloorRooms = new LinkedList<>();
        secondFloorRooms.add(new Room(4, "Комнаташечка", 5));
        secondFloorRooms.add(new Room(5, "Комнэтаа", 1));
        SecondFloor secondFloor = new SecondFloor(secondFloorRooms);

        Room[] thirdFloorRooms = new Room[2];
        thirdFloorRooms[0] = new Room(6, "Комныэта", 3);
        thirdFloorRooms[1] = new Room(7, "Комн", 2);
        ThirdFloor thirdFloor = new ThirdFloor(thirdFloorRooms);

        Building building = new Building("Пушкино", 5, "Здание", firstFloor, secondFloor, thirdFloor);
        building.showInfo(); //отображение полной информации о здании и ее комнатах
    }
}
