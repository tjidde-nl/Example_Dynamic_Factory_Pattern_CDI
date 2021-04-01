package com.swathisprasad.factorypattern.persons;

import com.swathisprasad.factorypattern.annotation.PersonType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * implementation of Person. This is an person of type B
 */
@PersonType("B")
public class ConcretePersonB implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonB.class);

    public void run() {
        LOGGER.info("{} is LongRunning", ConcretePersonB.class.getSimpleName());
    }
}
