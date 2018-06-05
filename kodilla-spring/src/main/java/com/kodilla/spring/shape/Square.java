package com.kodilla.spring.shape;

import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class Square implements Shape {


    public String getShapeName() {
        return "This is a Square";
    }
}
