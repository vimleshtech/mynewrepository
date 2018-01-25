package Module1;

import java.util.Scanner;


public class caller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(); 
		Employee e2 = new Employee();
		
		Employee e3 = new Employee("US");
		e3.newEmployee(11, "sss", 222, 333);
		
		Employee e4 = new Employee(e3);
		
		
		
		e1.a =22;
		e2.a =23;
		
		e1.b =22;
		e2.b =23;
		
		System.out.println(e1.a);//22   23 
		System.out.println(e2.a);//23   23
		
		System.out.println(e1.b);//22  22
		System.out.println(e2.b);//23  23
		
		e1.empDetails();
		e4.empDetails();
		
		
		/*
		Employee.a =11;
		Employee.test();
		
		
		
		Employee e = new Employee(); 
		Employee e2 = new Employee();
		
		
		e.newEmployee(111, "Raman", 23, 34000);
		e2.newEmployee(112, "jatin", 24, 34000);
		
		
		e2.empDetails();
		e.empDetails();
		*/
		
		
		
		
		
		
		

	}

}
