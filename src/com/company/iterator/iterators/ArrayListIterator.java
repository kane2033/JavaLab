package com.company.iterator.iterators;

import com.company.iterator.Room;

import java.util.ArrayList;

//итератор, проходящий по ArrayList
public class ArrayListIterator implements Iterator {
    private ArrayList<Room> rooms;
    private int position = 0;

    public ArrayListIterator(ArrayList<Room> rooms) {
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
