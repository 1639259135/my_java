import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        XStream xStream = new XStream(new Dom4JDriver());

        User user1 = new User("lisi","123");
        User user2 = new User("zhangsan","123");
        User user3 = new User("wangwu","123");


        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);

        Person person =new Person(users);

        xStream.toXML(person,new FileOutputStream("src/person.xml"));

        Person o = (Person) xStream.fromXML(new FileInputStream("src/person.xml"));

        List<User> userList = o.getUsers();

        System.out.println(o.toString());


    }


}
