package com.lanou3g.practice;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentException {

    }
    public static void allEles(Element e) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/data.xml"));
        List<Attribute> attributes = e.attributes();
        for (int i = 0; i < attributes.size(); i++) {
            Attribute att = attributes.get(i);
            System.out.println("属性为:" + att.getName() + "\t 属性值为:" + att.getValue());
        }
        String text = e.getText();
        System.out.println("当前文本为:" + text);

        List<Element> elements = e.elements();

        if (elements.size() == 0){
            return;
        }
        for (int i = 0; i < elements.size(); i++) {
            Element ele = elements.get(i);
            allEles(ele);
        }

    }
}
