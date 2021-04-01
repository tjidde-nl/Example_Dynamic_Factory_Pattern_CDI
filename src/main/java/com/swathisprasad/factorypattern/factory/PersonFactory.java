package com.swathisprasad.factorypattern.factory;

import com.swathisprasad.factorypattern.persons.Person;
import com.swathisprasad.factorypattern.annotation.PersonTypeNameAnnotation;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@ApplicationScoped
public class PersonFactory {

    /**
     * This Instance of person will be checked and injected by CDI via the Annotation.
     */
    @Inject
    @Any
    private Instance<Person> personInstance;


    /**
     * This method will check if the personType existed  if so it will return a implementation of person.
     * If not it will throw an error.
     * @param type a personType
     * @return the found person.
     */
    public Person getPerson(String type)  {
        Instance<Person> instance = this.personInstance.select(new PersonTypeNameAnnotation(type));

        if (!instance.isResolvable()) {
            throw new IllegalArgumentException("person type: " + type + " not supported");
        }

        return instance.get();
    }

}
