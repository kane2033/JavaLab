package com.company;

import com.company.threads.ConsumerThread;
import com.company.threads.ProducerThread;
import com.company.threads.UnitsStorage;

public class Main {

    static ProducerThread producer;
    static ConsumerThread consumer;
    static UnitsStorage storage;

    public static void main(String[] args) {
        storage = new UnitsStorage(50);
        producer = new ProducerThread(storage);
        consumer = new ConsumerThread(storage);
        producer.start();
        consumer.start();
    }
}
