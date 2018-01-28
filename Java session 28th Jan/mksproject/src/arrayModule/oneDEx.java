package arrayModule;

public class oneDEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]= new int[3];
		n[0] =11;
		n[1] =151;
		n[2] =13331;
		
		System.out.println(n[1]);
		System.out.println(n.length);
		
		for(int i=0; i<n.length;i++)
		{
			System.out.println(n[i]);	
		}
		
		//or
		String name[]={"raman","jaitn","divya"};
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);	
		}
		//print in reverse
		for(int i=name.length-1; i>=0;i--)
		{
			System.out.println(name[i]);	
		}
		
	}

}
