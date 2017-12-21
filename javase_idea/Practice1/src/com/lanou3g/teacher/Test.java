package com.lanou3g.teacher;



import java.util.Arrays;
import java.util.List;

/**
 * Created by zyf on 2017/12/7.
 */
public class Test {

	public static void main(String[] args) {
		GetDataFromXml<Student> gdfx = new GetDataFromXml<>();
		List<Student> students = gdfx.getFromXmlPath(Student.class, "src/test.xml");

		System.out.println(Arrays.toString(students.toArray()));
	}
}
