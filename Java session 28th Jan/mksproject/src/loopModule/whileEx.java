package loopModule;

public class whileEx {

	public static void main(String[] args) {

		int i=1; //init 
		while(i<10) //condition 
		{			
			System.out.print(i);
			i++; //i=i+1 // increment 
		}
		System.out.println("------------------");
		//print no. in reverse order 
		i=10; //init 
		while(i>0) //condition 
		{			
			System.out.println(i);
			
			i--;  // decrement 
		}
	
		//print all odd numbers between 3 to 37
		i =3;
		while(i<=37)
		{
			System.out.println(i);
			i+=2; //i=i+2; 
		}
		
		
	}

}
