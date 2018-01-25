package polyModule;

import java.util.Scanner;

public class BankAccount {

	String AccountNo;
	String Name; 
	String  PAN;	
	String Aadhar; 
	String  Address_Proof;
	String  Phone;
	String  Email;
	int amout;
	
	Scanner sc = new Scanner(System.in);
	
	public  void newAccount()
	{
		System.out.print("Enter Account #:");
		AccountNo = sc.next();
		
		System.out.print("Enter Account Name:");
		Name =sc.next();
		
		System.out.print("Enter PAN #:");
		PAN= sc.next();
		
		System.out.print("Enter ADH #:");
		Aadhar =sc.next();
		
		System.out.print("Enter Email :");
		Email = sc.next();
		
		System.out.print("Enter Phone #:");
		Phone =sc.next();
		
		
		System.out.print("Enter Address :");
		Address_Proof= sc.next();
		
		System.out.print("Enter Amount :");
		amout =sc.nextInt();
		
		
	}
	
}
