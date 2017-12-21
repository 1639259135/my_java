package com.lanou3g.task01.main;

import com.lanou3g.task01.exception.NoExistException;
import javafx.fxml.LoadException;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import com.lanou3g.task01.person.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Login{

    public UserInter login(String userName, String password1) throws DocumentException, LoadException, NoExistException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/com/lanou3g/task01/UserData.xml"));
        Element rootElement = document.getRootElement();
        List<Element> person = rootElement.elements();
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < person.size(); i++) {

            Element element = person.get(i);
            Person p = new Person();

            Attribute name = element.attribute("name");
            p.setName(name.getValue());

            Element username = element.element("username");
            String uN = username.getText();
            p.setUserName(uN);

            Element password = element.element("password");
            String pw = password.getText();
            p.setPassword(pw);

            Element job = element.element("job");
            String work = job.getText();
            p.setWork(work);

            people.add(p);
        }



        for (int i = 0; i < people.size(); i++) {
            Person person1 = people.get(i);
            String work = person1.getWork();
            if (userName.equals(person1.getUserName()) && password1.equals(person1.getPassword())){
                switch (work){
                    case "Worker":
                        return new Worker(person1.getName(),person1.getUserName(),person1.getPassword(),work);
                    case "Cooker":
                        return new Cooker(person1.getName(),person1.getUserName(),person1.getPassword(),work);
                    case "Doctor":
                        return new Doctor(person1.getName(),person1.getUserName(),person1.getPassword(),work);
                    case "Boss":
                        return new Boss(person1.getName(),person1.getUserName(),person1.getPassword(),work);
                }
            }
        }
//        throw new NoExistException();

        return null;
    }

}
