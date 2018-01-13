package com.lanou3g.homework.domain;

public class User {
    private String uname;
    private String loc;
    private int uid;
    private int age;

    @Override
    public String toString() {
        return "User{" + "uname='" + uname + '\'' + ", loc='" + loc + '\'' + ", uid=" + uid + ", age=" + age + '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
