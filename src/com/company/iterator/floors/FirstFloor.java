package com.company.iterator.floors;

import com.company.iterator.iterators.ArrayListIterator;
import com.company.iterator.iterators.Iterator;
import com.company.iterator.Room;

import java.util.ArrayList;

public class FirstFloor {
    private ArrayList<Room> rooms;

    public FirstFloor(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Iterator createIterator() { //создание итератора для клиента
        return new ArrayListIterator(rooms);
    }
}
