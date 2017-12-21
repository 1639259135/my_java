package com.lanou3g.day15_io;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private String gneder;

    public Person(String name, String gneder) {
        this.name = name;
        this.gneder = gneder;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", gneder='" + gneder + '\'' + '}';
    }
}
