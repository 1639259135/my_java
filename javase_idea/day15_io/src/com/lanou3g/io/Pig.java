package com.lanou3g.io;

import java.io.Serializable;

public class Pig implements Serializable{
    private String name;
    private String gender;

    public Pig(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pig{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + '}';
    }
}
