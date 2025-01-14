package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Tuesday {
    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    MorningRoutine morningRoutine = new MorningRoutine();
    Tractor tractor = new Tractor("Tractor");
    public Tuesday(){
    }
    public void activities(){
        System.out.println("\033[0;107m\033[1;93m\t\tTuesday Routine for CALM Farm\t\t\033[0m\n");
        morningRoutine.activities();
        froilan.operate(tractor);
        tractor.harvest(froilan);
        froilan.switchOff(tractor);
        house.store(froilan, froilanda);
        System.out.println("\n\033[0;107m\033[1;93m\t\tEnd of Tuesday\t\t\033[0m\n");
    }
}
