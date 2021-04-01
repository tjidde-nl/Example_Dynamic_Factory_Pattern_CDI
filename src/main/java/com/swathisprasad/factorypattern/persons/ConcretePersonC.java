package com.swathisprasad.factorypattern.persons;

import com.swathisprasad.factorypattern.annotation.PersonType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * implementation of Person. This is an person of type C
 */
@PersonType("C")
public class ConcretePersonC implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonC.class);

    public void run() {
        LOGGER.info("{} is ProgressionRunning", ConcretePersonC.class.getSimpleName());
    }
}
