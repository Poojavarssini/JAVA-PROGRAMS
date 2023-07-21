package practice;

import java.util.*;
class member {
	String name;
	int age;
	int phoneno;
	String address;
	int salary;
	public void printSalary() {
		System.out.println(salary);
	}
}

class employee extends member{
	String specialisation;
}

class manager extends member{
	String department;
}

public class mem_data{
	public static void main(String args[]) {
		employee e = new employee();
		e.name="pooja";
		e.age=20;
		e.phoneno=1234;
		e.address="frgtdhsja";
		e.salary=50000;
		e.specialisation="bghddhjkf";
		
		manager m = new manager();
		m.name="stephen";
		m.age=40;
		m.phoneno=345667;
		m.address="dsakcccc";
		m.salary=100000;
		m.department="bghddhjkf";
		
		e.printSalary();
		m.printSalary();

	}
}
