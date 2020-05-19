package com.company.iterator.floors;

import com.company.iterator.Room;
import com.company.iterator.iterators.ArrayIterator;
import com.company.iterator.iterators.Iterator;

public class ThirdFloor {
    private Room[] rooms;

    public ThirdFloor(Room[] rooms) {
        this.rooms = rooms;
    }

    public Iterator createIterator() { //создание итератора для клиента
        return new ArrayIterator(rooms);
    }
}
