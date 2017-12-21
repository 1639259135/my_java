package javase_practice.bean;

public class Person {
    private String userName;
    private String id;
    private String password;

    public Person(String userName, String id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    public Person() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
