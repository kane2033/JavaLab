package com.company.threads;

import com.company.hierarchy.AbstractUnit;

import java.util.ArrayList;
import java.util.List;

//класс-поток потребитель
public class ConsumerThread  extends Thread {

    private List<AbstractUnit> units = new ArrayList<>(); //содержит приобретенные юниты

    private UnitsStorage storage;

    public ConsumerThread(UnitsStorage storage) {
        super("Поток производителя"); //название потока
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println("Поток потребителя запущен");

        while (true) { //бесконечно потребляет товары со склада
            units.add(storage.get());
        }
    }
}
