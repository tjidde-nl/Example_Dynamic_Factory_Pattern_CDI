package com.swathisprasad.factorypattern;


import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class FactoryPattern
{
    public static void main(String[] args) {
        Weld weld = new Weld();
        try (WeldContainer weldContainer = weld.initialize()) {
            weldContainer.select(ConsoleClient.class).get().doEveryThing();
        }

    }
}

