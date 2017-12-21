package javase_practice.dao;

import javase_practice.Exception.RegisterUserNameErrorException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import sun.security.util.Password;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register {

    public void register(String id ,String userName,String password) throws IOException, DocumentException, RegisterUserNameErrorException {

        Pattern p1 = Pattern.compile("[a-zA-Z0-9]+?");
        Matcher m1 = p1.matcher(id);
        boolean ID = m1.matches();

        Pattern p2 = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m2 = p2.matcher(userName);
        boolean num = m2.matches();
//        System.out.println(m.matches()+"---");
        String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher m3 = regex.matcher(userName);
        boolean email = m3.matches();
//        System.out.println(matcher.matches());

        boolean m4 = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{1,20}").matcher(password).matches();
        System.out.println(password + "\n" +num + "\n"+email + "\n"+m4);


        if (ID == true && (num == true || email == true) && m4 == true){

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/com/lanou3g/javase_practice/UserData.xml"));

        Element userdata = document.getRootElement();
        Element user = userdata.addElement("user");
        user.addAttribute("name",id);
        Element username = user.addElement("usernmae");
        username.addText(userName);
        Element pw = user.addElement("password");
        username.addText(password);

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");

        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/com/lanou3g/javase_practice/UserData.xml"),outputFormat);
        xmlWriter.write(document);

        xmlWriter.close();
        System.out.println("注册成功:\n" + "用户:" + userName + "\t 账号:" + id);
        }
//        else{
//            throw new RegisterUserNameErrorException();
//        }
    }

}
