package loopModule;

public class nestedLoopEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int r=0; r<10;r++)
		{
				for(int c=0; c<3;c++)
				{
					//no of row * no of col= 9
					System.out.print("*");
				}
				System.out.println();
		}
		
		//r =0 c  = 0 1 2
		//r =1 c  = 0 1 2
		//r =2 c  = 0 1 2
		
		for(int r=0; r<10;r++)//row / height 
		{
				for(int c=0; c<=r;c++) //col / width 
				{
					//no of row * no of col= 9
					System.out.print("*");
				}
				System.out.println();
		}
	

	}

}
