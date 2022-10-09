package com.pro.wings.treeset.employee;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(10,"Sayali","Pune");
		Employee e2 = new Employee(20,"Dipali","Kolhapur");
		Employee e3 = new Employee(30,"Pooja","Mumbai");
		Employee e4 = new Employee(40,"Shrddha","Satara");
		
		
//		EmployeeIdComparator ec = new EmployeeIdComparator();
//		EmployeeNameComparator ec1 = new EmployeeNameComparator();
//		EmployeeCityComparator ec2 = new EmployeeCityComparator();
		
		
//		TreeSet ts = new TreeSet(new EmployeeIdComparator());
//			ts.add(e2);
//			ts.add(e1);
//			ts.add(e3);
//			ts.add(e4);
//		
//			System.out.println(ts);
		
		TreeSet ts1 = new TreeSet(new EmployeeNameComparator());
		
			ts1.add(e2);
			ts1.add(e1);
			ts1.add(e3);
			ts1.add(e4);
			
			System.out.println(ts1);
			
//		TreeSet	ts2 = new TreeSet(new EmployeeCityComparator());
//		
//			ts2.add(e3);
//			ts2.add(e2);
//			ts2.add(e1);
//			ts2.add(e4);
//			
//			System.out.println(ts2);
			
	}

}
