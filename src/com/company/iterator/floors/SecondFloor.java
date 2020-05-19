package com.company.iterator.floors;

import com.company.iterator.Room;
import com.company.iterator.iterators.Iterator;
import com.company.iterator.iterators.LinkedListIterator;

import java.util.LinkedList;

public class SecondFloor {
    private LinkedList<Room> rooms;

    public SecondFloor(LinkedList<Room> rooms) {
        this.rooms = rooms;
    }

    public Iterator createIterator() { //создание итератора для клиента
        return new LinkedListIterator(rooms);
    }
}
