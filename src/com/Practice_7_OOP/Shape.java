package com.Practice_7_OOP;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract String draw();
}
