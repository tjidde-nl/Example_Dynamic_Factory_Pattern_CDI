package com.swathisprasad.factorypattern;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
@ApplicationScoped
public class getOutOfStatic {
    @Inject
    iPersonFacade pf;

    public void doEveryThing(){
        pf.walk("A");
        pf.walk("B");
        pf.walk("C");
    }
}
