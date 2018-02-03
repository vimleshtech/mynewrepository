package module1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class wordcounter {

	//throws FileNotFoundException 
	public static void main(String[] args) throws FileNotFoundException{

		/*
		 * \     ->  \\
		 * \	 ->  /   
		 */
		
		int n,d,o;
		n =11;
		d =-10;
		
		try {
			
			
			
			try
			{
			
				if(d<1)
				{
					Exception ex = new Exception("divisor cannot be less than 1");
					throw ex;
				}
				o = n/d;
				System.out.println(o);
				
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			FileReader fr = new FileReader("C:\\Users\\vkumar15\\Desktop\\Session 3rd session.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String s="";
			while( (s=  br.readLine())!=null )
			{
			
				System.out.println(s);
			}
			
			br.close();
			fr.close();
			
			
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			//logout
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			//logout
		}		
		catch (Exception e) {
			
			//logout
			//e.printStackTrace();
			System.out.println(e);
			
			
		}
		finally{
			//logout 
			
		}
		
		try
		{
			
		}
		finally{
			
		}
		
				
	}

}
