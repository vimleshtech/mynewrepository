package conMoudle;

public class swithEx {

	public static void main(String[] args) {
		
		int choice =2;
		int a,b,c;
		a =33;
		b =44;
		
		
		switch(choice){
		
			case 1:
				c =a+b;
				System.out.println(c);
				
				
				break;
			case 2:
				c =a-b;
				System.out.println(c);
				break;
			case 3:
				c =a*b;
				System.out.println(c);
				break;
			default:  //else				
				System.out.println("invalid input");
				break;
		}

	}

}
