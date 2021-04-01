package com.swathisprasad.factorypattern;

import com.swathisprasad.factorypattern.annotation.PersonType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@PersonType("C")
public class ConcretePersonC implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonC.class);

    public void run() {
        LOGGER.info("{} is ProgressionRunning", ConcretePersonC.class.getSimpleName());
    }
}
