package com.pro.wings.treeset.employee;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.id == e2.id)
		return 0;
		else if (e1.id > e2.id)
		 return 1;
		else
			return -1;
	}
	

//	public int compare(Employee emp1, Employee emp2) {
//
//		if(emp1.id == emp2.id)
//		return 0;
//		else if (emp1.id > emp2.id)
//		 return -1;
//		else
//			return 1;		//for descending order
//	}
//	
	

}
