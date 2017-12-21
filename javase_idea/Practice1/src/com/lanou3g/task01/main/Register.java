package com.lanou3g.task01.main;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Register {

    public UserInter register(String name, String userName, String password1, String work) throws IOException, DocumentException {


//        Document document = DocumentHelper.createDocument();
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/com/lanou3g/task01/UserData.xml"));

        Element  root = document.getRootElement();

        Element person = root.addElement("person");
        person.addAttribute("name",name);
        Element username = person.addElement("username");
        username.addText(userName);
        Element password = person.addElement("password");
        password.addText(password1);
        Element job = person.addElement("job");
        job.addText(work);

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");

        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/com/lanou3g/task01/UserData.xml"),outputFormat);
        xmlWriter.write(document);

        xmlWriter.close();


        return null;
    }


}


