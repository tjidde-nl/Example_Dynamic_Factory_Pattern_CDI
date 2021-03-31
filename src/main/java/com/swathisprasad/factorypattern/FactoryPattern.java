package com.swathisprasad.factorypattern;

public class FactoryPattern
{
    public static void main( String[] args ) throws NoSuchMethodException {
        Person person = PersonFactory.getPerson("BaseRun");
        person.run();

        person = PersonFactory.getPerson("LongRun");
        person.run();

        person = PersonFactory.getPerson("ProgressionRun");
        person.run();

        try{person = PersonFactory.getPerson("lala");
        }
        catch (NoSuchMethodException e){
            System.err.println(e);
        }
    }
}

