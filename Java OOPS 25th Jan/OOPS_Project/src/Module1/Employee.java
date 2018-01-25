package Module1;

import java.util.Scanner;

//class : is wrapper of data member and function 
public class Employee {

	
	//data member/ member variable / global variable  / attribute 
	private int empid;
	String ename;
	int age;
	int sal;
	
	static int a;
	int b;

	
	//constructor 
	Employee()
	{
		System.out.println("in constructor");
		ename  ="Guest";
		
	}
	
	Employee(String Country)
	{
		System.out.println("in constructor");
		if(Country.equals("US"))
			ename  ="New User";
		else if(Country.equals("UK"))
			ename ="Client";
		else
			ename ="Guest";
		
		
	}
	Employee(String Country,int age)
	{
		System.out.println("in constructor");
		if(Country.equals("US"))
			ename  ="New User";
		else if(Country.equals("UK"))
			ename ="Client";
		else
			ename ="Guest";
		
		
	}
	//copy constructor 
	Employee(Employee o)
	{
		ename = o.ename;
		
	}
	static void test()
	{
		
	}
		
	//function /methods/ operations 
	void newEmployee(int id, String name, int a, int s)
	{
		empid = id;
		ename += name;
		
		age =a;
		sal = s;
	}
	
	public void empDetails()
	{
		System.out.println("*****Employee Details*****");
		System.out.println("Employee Id :"+empid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+sal);
		
	}
	
}
