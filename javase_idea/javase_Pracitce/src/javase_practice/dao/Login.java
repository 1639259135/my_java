package javase_practice.dao;

import javase_practice.bean.Person;
import javase_practice.util.ExecuteInter;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private List<Person> pList;
    public Person login(String id,String password) throws DocumentException {

//        SAXReader saxReader = new SAXReader();
//        Document document = saxReader.read(new File("src/com/lanou3g/javase_practice/UserData.xml"));
//        Element rootElement = document.getRootElement();
//        List<Element> elements = rootElement.elements();
//        List<Person> people = new ArrayList<>();
//        for (int i = 0; i < elements.size(); i ++) {
//            Element element = elements.get(i);
//            Person person = new Person();
//
//            Attribute name = element.attribute("name");
//            person.setUserName(name.getValue());
//
//            Element username = element.element("username");
//            person.setId(username.getText());
//
//            Element pw = element.element("password");
//            person.setPassword(pw.getText());
//
//            people.add(person);
//        }

        JdbcUtil.execute(new ExecuteInter() {
            @Override
            public Statement execute(Connection coon) throws SQLException {
                Statement statement = coon.createStatement();
                    String sql = "select * from hw_user";
                ResultSet rs = statement.executeQuery(sql);
                try {
                    pList = new ArrayList<>();
            while (rs.next()){
                Person person = new Person();
                person.setId(rs.getString(1));
//                System.out.println(rs.getString(1));
                person.setUserName(rs.getString(2));
//                System.out.println(rs.getString(2));
                person.setPassword(rs.getString(3));
                pList.add(person);
            }
//                    System.out.println(pList.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
            }
        });

        for (int i = 0; i < pList.size(); i++) {
            Person p = pList.get(i);
            System.out.println(p.toString());
            if (p.getId().equals(id) && p.getPassword().equals(password)){
                System.out.println("登录成功");
                System.out.println("用户:" + p.getUserName() + "\t账号:" + p.getId());
            }
        }
        return null;
    }
}
