package com.swathisprasad.factorypattern;

import com.swathisprasad.factorypattern.annotation.PersonType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@PersonType("A")
public class ConcretePersonA implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcretePersonA.class);

    public void run() {
        LOGGER.info("{} is BaseRunning", ConcretePersonA.class.getSimpleName());
    }
}
