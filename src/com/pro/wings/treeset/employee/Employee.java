package com.pro.wings.treeset.employee;

import java.util.Objects;

public class Employee {

	int id;
	String name;
	String city;
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	Employee(){
		super();
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(city, id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}

    @Override
	public String toString() {

		return "Employee [id ="+ id +", name = "+ name +",city ="+ city +"]";
	}
	

}
