package com.Practice_6_OOP;

public class Aspirant extends Student {
    String workName;

    public Aspirant(String name, int age, String workName) {
        super(name, age);
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "workName='" + workName + '\'' +
                "} " + super.toString();
    }
}
