package arrayModule;

import java.util.Scanner;

public class TabularArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int nn;
		String fn;
		System.out.println("enter data :");
		//nn = sc.nextInt();
		fn = sc.nextLine();
		
		System.out.println("output :"+fn);
		
		int data[][] = new int[2][3]; //2 row and 3 col
		
		int d[][] ={{1,1,44},{33,44,55}};
		data[0][0] =11;
		data[0][1] =12;		
		data[0][2] =113;
		
		data[1][0] =124;
		data[1][1] =1133;
		data[1][2] =124;
		
		System.out.println(data[1][2]);
		System.out.println(data.length);
		System.out.println(data[1].length);
		
		
		for(int i=0; i<data.length;i++)
		{
			
			for(int c=0; c<data[i].length;c++)
			{
				System.out.print(data[i][c]+"\t");
			}
			System.out.println();
		}
		
	}

}
