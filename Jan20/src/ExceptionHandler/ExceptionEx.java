package ExceptionHandler;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n,d,o;
		
		System.out.println("enter data: ");
		n = sc.nextInt();
		
		System.out.println("enter divisor : ");
		d = sc.nextInt();
		
		try
		{
			if(d<1) 
			{
				Exception err = new Exception("divisor cannot be less than 1");
				
				throw err; //go to catch block   
				
			}
			o = n/d;			
			System.out.println("out : "+o);
			//n =0;
			//d = 0;
			
		}
		catch (Exception abc) { //Exception : is inbuilt class , abc is variable/object
			//n =0;
			//d = 0;
			
			System.out.println("invalid input "+abc);
		}
		finally{
			n =0;
			d = 0;			
		}
		System.out.println(n);
		System.out.println(d);
		
		
		System.out.println("end of program");
		
		

	}

}
