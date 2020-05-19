package com.company.iterator.iterators;

import com.company.iterator.Room;
import java.util.LinkedList;

//итератор, проходящий по LinkedList
public class LinkedListIterator implements Iterator {
    private LinkedList<Room> rooms;
    private int position = 0;

    public LinkedListIterator(LinkedList<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean hasNext() {
        return position < rooms.size() && rooms.get(position) != null;
    }

    @Override
    public Object next() {
        Room room = rooms.get(position);
        position++;
        return room;
    }
}
