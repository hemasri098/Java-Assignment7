package com.company.JavaAssignment7.first;

import java.util.logging.Logger;

interface IRodent {
    void food();
    void walk();
}

class Rodent implements IRodent{
    Logger LOGGER = Logger.getAnonymousLogger();
    Rodent() {
        LOGGER.info("rodent class");
    }

    public void food() {
        LOGGER.info("food - rodent");
    }

    public void walk() {
        LOGGER.info("rodent walks");
    }
}


class Gerbil extends Rodent{
    Logger LOGGER = Logger.getAnonymousLogger();
    Gerbil() {
        LOGGER.info("gerbil class");
    }
    public void food() {
        LOGGER.info("food - gerbil");
    }
    public void walk() {
        LOGGER.info("gerbil walks");
    }
}



class Mouse extends Rodent {
    Logger LOGGER = Logger.getAnonymousLogger();
    Mouse() {
        LOGGER.info("mouse class");
    }
    public void food() {
        LOGGER.info("food - mouse");
    }
    public void walk() {
        LOGGER.info("mouse walks");
    }
}

class Hamster extends Rodent {
    Logger LOGGER = Logger.getAnonymousLogger();
    Hamster() {
        LOGGER.info("hamster class");
    }
    public void food() {
        LOGGER.info("food - Hamster");
    }
    public void walk() {
        LOGGER.info("Hamster walks");
    }
}

public class FirstClass {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getAnonymousLogger();
        try {
            Rodent rodent[] = new Rodent[3];
            rodent[0] = new Mouse();
            rodent[1] = new Gerbil();
            rodent[2] = new Hamster();
            rodent[0].food();
            rodent[1].food();
            rodent[1].walk();
            rodent[2].food();
        }
        catch (Exception e) {
            LOGGER.info("Exception: " + e);
        }
    }
}
