package com.swathisprasad.factorypattern.annotation;

import com.swathisprasad.factorypattern.Person;

import javax.enterprise.util.AnnotationLiteral;

public class PersonTypeNameAnnotation extends AnnotationLiteral<PersonType> implements PersonType{
    private final String name;

    public PersonTypeNameAnnotation(String _name) {
        this.name = _name;
    }
    @Override
    public String value() {
        return this.name;
    }
}
