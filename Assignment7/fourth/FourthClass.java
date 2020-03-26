package com.company.JavaAssignment7.fourth;
import java.util.logging.Logger;

interface Cycle {
    void balance();
}

interface CycleFactory {
    Cycle cycleType();
}

class UniCycle implements Cycle {
    Logger LOGGER = Logger.getAnonymousLogger();
    public void balance() {
        LOGGER.info("balancing unicycle");
    }
}

class BiCycle implements Cycle {
    Logger LOGGER = Logger.getAnonymousLogger();
    public void balance() {
        LOGGER.info("balancing bicycle");
    }
}
class TriCycle implements Cycle {
    Logger LOGGER = Logger.getAnonymousLogger();
    public void balance() {
        LOGGER.info("balancing tricycle");
    }
}



class UniCycleFactory implements CycleFactory {
    public Cycle cycleType() {
        return new UniCycle();
    }
}


class BiCycleFactory implements CycleFactory {
    public Cycle cycleType() {
        return new BiCycle();
    }
}

class TriCycleFactory implements CycleFactory {
    public Cycle cycleType() {
        return new TriCycle();
    }
}


public class FourthClass {
    public static Logger LOGGER = Logger.getAnonymousLogger();
    public static void callFactory(CycleFactory factory) {
        Cycle cycle = factory.cycleType();
        cycle.balance();
    }
    public static void main(String[] args) {
        try {
            UniCycle cycle = new UniCycle();
            cycle.balance();
            callFactory(new BiCycleFactory());
            callFactory(new TriCycleFactory());
        }
        catch(Exception e) {
            LOGGER.info("Exception: " + e);
        }
    }
}
