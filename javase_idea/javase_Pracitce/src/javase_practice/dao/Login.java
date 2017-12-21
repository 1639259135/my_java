package javase_practice.dao;

import javase_practice.bean.Person;
import javase_practice.util.JdbcUtil;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Login {

    public Person login(String id,String password) throws DocumentException {

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/com/lanou3g/javase_practice/UserData.xml"));
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < elements.size(); i ++) {
            Element element = elements.get(i);
            Person person = new Person();

            Attribute name = element.attribute("name");
            person.setUserName(name.getValue());

            Element username = element.element("username");
            person.setId(username.getText());

            Element pw = element.element("password");
            person.setPassword(pw.getText());

            people.add(person);
        }

        JdbcUtil.execute(new ExecuteInter(){

        });





        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getId().equals(id) && person.getPassword().equals(password)){
                System.out.println("登录成功");
                System.out.println("用户:" + person.getUserName() + "\t账号:" + person.getId());
            }
        }
        return null;
    }
}
