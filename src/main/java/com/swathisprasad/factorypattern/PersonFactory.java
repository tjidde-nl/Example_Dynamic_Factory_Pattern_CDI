package com.swathisprasad.factorypattern;

public class PersonFactory {

    public static Person getPerson(String type) throws NoSuchMethodException {
        switch (type){
            case "BaseRun": return new ConcretePersonA();
            case "LongRun": return new ConcretePersonB();
            case "ProgressionRun": return new ConcretePersonC();
            default: throw new NoSuchMethodException("Person not found");
        }
    }
}
