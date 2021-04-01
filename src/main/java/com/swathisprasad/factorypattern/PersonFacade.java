package com.swathisprasad.factorypattern;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PersonFacade implements iPersonFacade{
    @Inject
    PersonFactory pf;


    Person p;
    @Override
    public void getPerson(String a){
        p = pf.getPerson(a);
    }

    @Override
    public void walk(String a){
        getPerson(a);
        p.run();
    }
}
