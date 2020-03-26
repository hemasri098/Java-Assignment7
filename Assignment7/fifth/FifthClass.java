package com.company.JavaAssignment7.fifth;
import java.util.logging.Logger;

class OuterClass_1 {
    class InnerClass_1 {
        Logger LOGGER = Logger.getAnonymousLogger();
        InnerClass_1(String str) {
            LOGGER.info("Innerclass constructor with parameter " + str);
        }
    }
}
class OuterClass_2 extends OuterClass_1{
    class InnerClass_2  extends InnerClass_1{
        InnerClass_2(String str) {
            super(str);
        }
    }
}

public class FifthClass {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getAnonymousLogger();
        try {
            OuterClass_2 outclass1 = new OuterClass_2();
            OuterClass_2.InnerClass_2 in = outclass1.new InnerClass_2("string");
        }
        catch (Exception e) {
            LOGGER.info("Exception: " + e);
        }
    }
}

