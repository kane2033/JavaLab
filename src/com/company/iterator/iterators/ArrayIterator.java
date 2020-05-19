package com.company.iterator.iterators;

import com.company.iterator.Room;

//итератор, проходящийся по массиву комнат
public class ArrayIterator implements Iterator {
    private Room[] rooms;
    private int position = 0;

    public ArrayIterator(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean hasNext() {
        return position < rooms.length && rooms[position] != null;
    }

    @Override
    public Object next() {
        Room room = rooms[position];
        position++;
        return room;
    }
}
