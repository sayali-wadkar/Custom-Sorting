package com.pro.wings.treeset.student;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student(60, "Sayali");
		Student s2 = new Student(70, "Arati");
		Student s3 = new Student(80, "Shrddha");
		Student s4 = new Student(90, "Pooja");
		
		TreeSet ts = new TreeSet ();
		
		ts.add(s2);
		ts.add(s1);
		ts.add(s4);
		ts.add(s3);
		
		
		System.out.println(ts);
		

		
	}

}
