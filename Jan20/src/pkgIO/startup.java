package pkgIO;

import java.util.Scanner;


public class startup {
	
	public static void main(String[] args) {
	

		Scanner o = new Scanner(System.in);
		int n1,n2,n3;
		String name;
				
		System.out.println("enter data :");
		n1 = o.nextInt();
				

		System.out.println("enter data :");
		n2 = o.nextInt();
				

		System.out.println("enter data :");
		n3 = o.nextInt();
				
		
		System.out.println("enter data :");
		name = o.next();
		
		//output 
		System.out.println("id is : "+n1);
		System.out.println("id is : "+n2);		
		System.out.println("name is : "+name);
		
		/* 
		 * conditional statement:
		 * i. if 
		 * ii. switch case		  
		 */
		
		//if else 
		//show greater number in two input
		if(n1>n2)  //condition 
		{
			//true
			System.out.println("n1 is greater");
		}
		else 
		{	//false 
			System.out.println("n2 is greater");
			
		}
		
		//if else if ....
		//show graeter num. in three input
		if(n1 > n2 && n1> n3) //condition with and (&&)
		{
			System.out.println("n1 is greater");		
					
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is greater");		
			
		}
		else 
		{
			System.out.println("n3 is greater");		
			
		}
		
		
			
		
	}

}
