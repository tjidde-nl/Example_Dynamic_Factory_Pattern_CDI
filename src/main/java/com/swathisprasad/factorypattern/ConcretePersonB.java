package com.swathisprasad.factorypattern;

import com.swathisprasad.factorypattern.annotation.PersonType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PersonType("B")
public class ConcretePersonB implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonB.class);

    public void run() {
        LOGGER.info("{} is LongRunning", ConcretePersonB.class.getSimpleName());
    }
}
