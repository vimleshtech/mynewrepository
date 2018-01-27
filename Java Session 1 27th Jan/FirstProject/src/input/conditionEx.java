package input;

public class conditionEx {

	public static void main(String[] args) {

		int n=21;
		
		//check even no.
		if(n%2==0)
		{
			System.out.println("enven no");
		}
	
		//
		if(n%2==0)
		{
			System.out.println("enven no");
		}
		else
		{
			System.out.println("odd no");
		}
	
		//if else if ....
		int hs,es,cs;
		hs =34;
		es =64;
		cs =84;
		
		int total = hs+es+cs;
		int avg = total/3;
		
		System.out.println(avg);
		
		if(avg>70)
		{
			System.out.println("A");
		}
		else if(avg>60)
		{
			
			System.out.println("B");
		}
		else if (avg>50)
		{
			System.out.println("C");
		}
		else 
		{
			System.out.println("D");
		}
		
		//if with and 
		int a,b,c;
		a =33;
		b =44;
		c =444;
		if(a>b && a>c)
		{
			System.out.println("a is gt");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is gt");
		}
		else
		{
			System.out.println("c is gt");
		}
		

		//nested if else 
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is gt");
			}
			else
			{
				System.out.println("c is t");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is t");	
			}
			else
			{
				System.out.println("c is gt");
			}
		}

	}

}
