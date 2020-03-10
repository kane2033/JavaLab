package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<AbstractUnit> units = new ArrayList<AbstractUnit>();
        int classesAmount = 4;
        int unitsAmount = 2;
        int min_mod = 0;
        int max_mod = 15;
        int random = 0;
        int randomMod = 0;
        for (int i = 0; i < unitsAmount; i++) {
            random = ThreadLocalRandom.current().nextInt(0, classesAmount);
            randomMod = ThreadLocalRandom.current().nextInt(min_mod, max_mod);
            System.out.println(random + "; " + randomMod);
            switch (random) {
                case (0):
                    Soldier commander = new Commander("Commander A", 25 + randomMod, 20 + randomMod,
                            5 + randomMod, 5 + randomMod, 5 + randomMod, 5 + randomMod);
                    commander = new EmpoweredAmmo(commander);
                    units.add(commander);
                    break;
                case (1):
                    Soldier scavenger = new Scavenger("Scavenger A", 30 + randomMod, 15 + randomMod,
                            10 + randomMod, 10 + randomMod, 2 + randomMod);
                    scavenger = new StaminaBooster(scavenger);
                    units.add(scavenger);
                    break;
                case(2):
                    Vehicle helicopter = new Helicopter("Helicopter A", 60 + randomMod,
                            40 + randomMod, 15 + randomMod, 20 + randomMod, 2 + randomMod);
                    helicopter = new TitanicArmor(helicopter);
                    units.add(helicopter);
                    break;
                case(3):
                    Vehicle medicalStation = new MedicalStation("Med Station A", 35 + randomMod,
                            40 + randomMod, 2 + randomMod, 10 + randomMod, 15 + randomMod);
                    units.add(medicalStation);
                    break;
            }
        }
        for (AbstractUnit unit:units) {
            unit.ShowInfo();
            System.out.println();
        }
    }
}
