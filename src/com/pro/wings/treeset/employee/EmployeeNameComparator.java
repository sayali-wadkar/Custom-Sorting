package com.pro.wings.treeset.employee;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1,Employee s2) {
			
			return s1.name.compareTo(s2.name);
		
		}
		
	
//public int compare(Employee s1,Employee s2) {
//		
//		return -(s1.name.compareTo(s2.name));	//for descending order
//	
//	}

}
