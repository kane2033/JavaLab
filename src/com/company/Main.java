package com.company;

import com.company.decorator.*;
import com.company.factoryMethod.*;
import com.company.hierarchy.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static List<AbstractUnit> units = new ArrayList<>();

    static ProducerThread producer;
    static Thread consumerThread;

    //метод потребителя
    static Runnable consumer = new Runnable() {
        public void run() {
            System.out.println("Поток потребителя запущен, на старте юнитов:" + producer.getUnitsAmount());
            while (producer.getUnitsAmount() > 0) {
                try { //"потребление"
                    units.add(producer.getUnit());
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    System.out.println("Поток потребителя прерван");
                }
            }
        }
    };

    public static void main(String[] args) {
        producer = new ProducerThread();
        consumerThread = new Thread(consumer);
        consumerThread.start();
        producer.start();
    }
}
