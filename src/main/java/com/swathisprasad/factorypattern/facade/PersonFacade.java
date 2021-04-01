package com.swathisprasad.factorypattern.facade;

import com.swathisprasad.factorypattern.persons.Person;
import com.swathisprasad.factorypattern.factory.PersonFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PersonFacade implements iPersonFacade{
    @Inject
    PersonFactory pf;
    Person p;

    /**
     * Set person to the proper instance. This is done here to keep the code more readable.
     * @param personType type of a person.
     */
    private void getPerson(String personType){
        p = pf.getPerson(personType);
    }

    /**
     * This method will get a person via the getPerson(personType)
     * Then it will makae the person run.
     * @param personType type of a person.
     */
    @Override
    public void walk(String personType){
        getPerson(personType);
        p.run();
    }
}
