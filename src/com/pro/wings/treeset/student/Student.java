package com.pro.wings.treeset.student;

import java.util.Objects;

public class Student implements Comparable<Student>
{
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && roll == other.roll;
	}
	
	@Override
	public String toString() {
		return " [ Student roll = "+ roll +" name = "+ name +"]";
	}


//	public int compareTo(Student o) {
//		
//		return this.name.compareTo(o.name);		//for string sorting
//	}

	public int compareTo(Student s) {
		
		if(this.roll == s.roll)
		return 0;
		else if(this.roll > s.roll)
			return 1;
		else
			return -1;
	}
//public int compareTo(Student s) {
//		
//		if(this.roll == s.roll)
//		return 0;
//		else if(this.roll > s.roll)
//			return -1;
//		else
//			return 1;		//for descending  order
//	}
}
