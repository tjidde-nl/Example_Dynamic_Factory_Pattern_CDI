package com.swathisprasad.factorypattern.annotation;

import javax.enterprise.util.AnnotationLiteral;

/**
 * This is to get the data out of an annotation of @PersonType
 */
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
