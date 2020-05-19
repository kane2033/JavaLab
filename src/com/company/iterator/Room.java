package com.company.iterator;

//класс комнаты
public class Room {

    private int idRoom;
    private String name;
    private int occupantsAmount;

    public Room(int idRoom, String name, int occupantsAmount) {
        this.idRoom = idRoom;
        this.name = name;
        this.occupantsAmount = occupantsAmount;
    }

    public void showInfo() {
        System.out.println("Название комнаты под номером '" + idRoom + "': '" + name
                + "', кол-во проживающих: '" + occupantsAmount + "';");
    }
}
