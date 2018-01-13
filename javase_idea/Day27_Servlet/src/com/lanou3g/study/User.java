package com.lanou3g.study;

public class User {
    private String username;
    private String gender;
    private int age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", gender='" + gender + '\'' + ", age=" + age + '}';
    }
}
