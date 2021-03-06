package com.company.JavaAssignment7.second;
import java.util.logging.Logger;

//cycle class
class Cycle {
    Logger LOGGER = Logger.getAnonymousLogger();
    void balance() {
        LOGGER.info("balancing cycle");
    }
}
//subclasses extending cycle class
class UniCycle extends Cycle {
    Logger LOGGER = Logger.getAnonymousLogger();
    public UniCycle() {
        LOGGER.info("Inside unparameterised unicycle constructor");
    }
    public void balance() {
       LOGGER.info("balancing unicycle");
    }
}

class BiCycle extends Cycle {
    Logger LOGGER = Logger.getAnonymousLogger();
    public BiCycle() {
        LOGGER.info("Inside unparameterised bicycle constructor");
    }
    public void balance() {
        LOGGER.info("balancing bicycle");
    }
}
class TriCycle extends Cycle {
    Logger LOGGER = Logger.getAnonymousLogger();
    public TriCycle() {
        LOGGER.info("Inside unparameterised tricycle constructor");
    }
}

public class SecondClass {
    //method to show upcasting
    public static void upcast(Cycle[] arrayOfCycleObjects) {
        UniCycle unicycle = new UniCycle();
        BiCycle bicycle = new BiCycle();
        TriCycle tricycle = new TriCycle();
        arrayOfCycleObjects[0] = (Cycle)unicycle;//upcasting
        arrayOfCycleObjects[1] = (Cycle)bicycle;
        arrayOfCycleObjects[2] = (Cycle)tricycle;
        arrayOfCycleObjects[0].balance();
        arrayOfCycleObjects[1].balance();
        arrayOfCycleObjects[2].balance();
    }
    //method for downcasting
    public static void downcast(Cycle[] arrayOfCycleObjects) {
        Cycle unicycle = new UniCycle();
        Cycle bicycle = new BiCycle();
        Cycle tricycle = new TriCycle();
        arrayOfCycleObjects[0] = (UniCycle)unicycle;//downcasting
        arrayOfCycleObjects[1] = (BiCycle)bicycle;
        arrayOfCycleObjects[2] = (TriCycle)tricycle;
        arrayOfCycleObjects[0].balance();
        arrayOfCycleObjects[1].balance();
        arrayOfCycleObjects[2].balance();
    }
    public static void main(String[]args) {
        Cycle[] arrayOfCycleObjects = new Cycle[3]; //this does not create the objects
        Logger LOGGER = Logger.getAnonymousLogger();
        try {
            upcast(arrayOfCycleObjects);
            downcast(arrayOfCycleObjects);
        }
        catch(Exception e) {
            LOGGER.info("Exception: "+ e);
        }
    }
}
