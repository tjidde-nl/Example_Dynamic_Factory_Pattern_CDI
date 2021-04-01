package com.swathisprasad.factorypattern;

import com.swathisprasad.factorypattern.annotation.PersonTypeNameAnnotation;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@ApplicationScoped
public class PersonFactory {

    @Inject
    @Any
    private Instance<Person> personInstance;


    public Person getPerson(String type)  {
        Instance<Person> instance = this.personInstance.select(new PersonTypeNameAnnotation(type));

        if (!instance.isResolvable()) {
            throw new IllegalArgumentException("person type: " + type + " not supported");
        }

        return instance.get();
    }

}
