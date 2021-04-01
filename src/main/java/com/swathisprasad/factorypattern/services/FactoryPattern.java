package com.swathisprasad.factorypattern.services;


import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class FactoryPattern
{
    /**
     * Weld will create an instance of CDI without a server with CDI.
     * This is done to make it runnable without servers. This makes it easier to do some tests with the code.
     * @param args default in a main.
     */
    public static void main(String[] args) {
        Weld weld = new Weld();
        try (WeldContainer weldContainer = weld.initialize()) {
            weldContainer.select(ConsoleClient.class).get().doEveryThing();
        }

    }
}

