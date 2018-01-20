package ExceptionHandler;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class nestedTryCatch {

	public static void main(String[] args) {

		
		int n,d,o;
		n =22;
		d = 2;
		
		int arr[] ={22,332323,43,32,343};
		
		
		try
		{
			System.out.println("start");
			System.out.println("start");
			System.out.println("start");
			
			
			try
			{
				System.out.println(arr[10]);
			
			}
			catch (Exception e) {
				System.out.println("error in array");
			}
			
			o = n/d;
			System.out.print(o);
			
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		catch (Exception e) {
			System.out.println(e);
			
		}
		
		
		

	}

}
