package com.pro.wings.treeset.employee;

import java.util.Comparator;

public  class EmployeeCityComparator implements Comparator<Employee> {

	

	@Override
	public int compare(Employee s1, Employee s2) {
		
		return s1.city.compareTo(s2.city);
	}
	
	
//	public int compare(Employee s1, Employee s2) {
//		
//		return -(s1.city.compareTo(s2.city));		//	for descending order
//	}
//	
	
	

}
