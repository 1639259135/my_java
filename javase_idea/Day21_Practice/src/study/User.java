package study;

public class User {
    private String uname;
    private int id;
    private String loc;
    private int age;

    @Override
    public String toString() {
        return "User{" + "uname='" + uname + '\'' + ", id=" + id + ", loc='" + loc + '\'' + ", age=" + age + '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}