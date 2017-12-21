package com.lanou3g.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main02 {

    static SAXReader reader = new SAXReader();
    static Document document = null;

    public static void main(String[] args) throws DocumentException {

        document = reader.read(new File("src/data.xml"));

        List<Student> students = listElement();

        System.out.println(Arrays.toString(students.toArray()));
        //students.toArray()转换成数组;  Arrays.toString()输出数组

//        allEles(document.getRootElement());

    }

    public static void allEles(Element e ){

        List<Attribute> attributes = e.attributes();

        for (int i = 0; i < attributes.size(); i ++) {
            Attribute att = attributes.get(i);
            System.out.println("当前文本属性:");
            System.out.println( "属性为:"+ att.getName() + "\t属性值:" + att.getValue());
        }
        String text = e.getText();
        System.out.println("当前元素的文本:" + text);

        List<Element> elements = e.elements();
        //如果没有子标签,结束这个方法
        if (elements.size() == 0){
            return;
        }
        for (int i = 0;i < elements.size(); i ++){
            //获得第i个子标签
            Element ele = elements.get(i);

            //扔到allEles方法中
            allEles(ele);

        }
    }


    private static List<Student> listElement() throws DocumentException {

        Element rootElement = document.getRootElement();
        List<Element> student = rootElement.elements("student");


        List<Student> studentsData = new ArrayList<>();

        for (int i = 0; i < student.size(); i ++){
            Element ele = student.get(i);
            Student stu = new Student();

            Attribute name = ele.attribute("name");
            //获得name属性
            String nameVallue = name.getValue();
            //设置到stu对象中
            stu.setName(nameVallue);

            Element score = ele.element("score");
            //拿到score标签中的文本
            String text = score.getText();
            //"1001" -----> 1001
            stu.setScore(Integer.parseInt(text));

            //把数据健全的学生装到集合里
            studentsData.add(stu);

            System.out.println("学生的姓名为:" + nameVallue + "\t" + "学生的分数为:" + text);

        }
        return studentsData;
    }
}
