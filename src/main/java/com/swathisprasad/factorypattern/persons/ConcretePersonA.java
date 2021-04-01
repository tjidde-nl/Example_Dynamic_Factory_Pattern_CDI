package com.swathisprasad.factorypattern.persons;

import com.swathisprasad.factorypattern.annotation.PersonType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * implementation of Person. This is an person of type A
 */
@PersonType("A")
public class ConcretePersonA implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonA.class);

    public void run() {
        LOGGER.info("{} is BaseRunning", ConcretePersonA.class.getSimpleName());
    }
}
