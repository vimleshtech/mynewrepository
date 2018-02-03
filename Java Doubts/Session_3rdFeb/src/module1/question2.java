package module1;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s ,ts;
		System.out.println("enter size of array: ");
		s = sc.nextInt();
		
		int n[] = new int[s];
		int c[][] = new int[s][2];
										
		for(int i=0; i<s; i++)
		{
		
			System.out.println("enter data for array: ");
			n[i] = sc.nextInt();
			
		}
		
		int ind =0;
		for(int d: n)
		{
			int flag = 1,mind  =-1;
			
			for(int i =0;i <s; i++)
			{
					if(d== c[i][0])
					{
						flag = 0;
						mind = i;
						
					}
			}
			
			if(flag == 1)
			{
				c[ind][0] = d;
				c[ind][1] = 1;
				ind++;
			}
			else
			{
				c[mind][1] = c[mind][1]+1;
			}
		}
		
		for(int i=0; i<s;i++)
		{
			if(c[i][1]>1)
				
				System.out.print(c[i][0]+":"+c[i][1]);
			
		}
		
	}

}
