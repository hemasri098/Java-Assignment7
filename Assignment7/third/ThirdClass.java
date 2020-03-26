package com.company.JavaAssignment7.third;

import java.util.logging.Logger;

interface IAddition {
    void addNumbers(int a, int b);

}

interface IMultiplication {
    void multiplyNumbers(int a, int b);

}

interface IDivision {
    void divideNumbers(int a, int b);

}

interface ICalculation extends IAddition, IMultiplication, IDivision {
    void get(int a, int b);
}

class CalculateB {
    public void print() {
        System.out.println("CalculateB class");
    }
}
class CalculateA extends CalculateB implements ICalculation {
    Logger LOGGER = Logger.getAnonymousLogger();
    public void function1(IAddition add) {
        add.addNumbers(1, 2);

    }
    public void function2(IMultiplication mul) {
        mul.multiplyNumbers(1, 2);

    }
    public void function3(IDivision div) {
        div.divideNumbers(4,2);

    }
    public void function4(ICalculation cal) {
        cal.get(3, 4);
    }



    @Override
    public void addNumbers(int a, int b) {
        LOGGER.info("adding given two elements " + (a + b));
    }

    @Override
    public void multiplyNumbers(int a, int b) {
        LOGGER.info("multiplying given two elements " + (a * b));
    }

    @Override
    public void divideNumbers(int a, int b) {
        LOGGER.info("dividing given two elements " + (a / b));
    }


    @Override
    public void get(int a, int b) {
        LOGGER.info("printing two numbers " + a + " " + b);
    }

}
public class ThirdClass {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getAnonymousLogger();
        try {
            CalculateA calculatea = new CalculateA();
            calculatea.function1(calculatea);
            calculatea.function2(calculatea);
            calculatea.function3(calculatea);
            calculatea.function4(calculatea);
            calculatea.get(6, 7);
        }
        catch(Exception e) {
            LOGGER.info("Exception: " + e);
        }
    }
}


