package com.swathisprasad.factorypattern.services;

import com.swathisprasad.factorypattern.facade.iPersonFacade;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * This class is to do everything without having to be static. To get out of the Static main.
 * It is ApplicationScoped. Because there is only one instance needed.
 */
@ApplicationScoped
public class ConsoleClient {
    @Inject
    iPersonFacade pf;

    /**
     * This method makes multiple types of person walk.
     */
    public void doEveryThing(){
        pf.walk("A");
        pf.walk("B");
        pf.walk("C");
    }
}
