package module1;

import java.util.Scanner;

public class questions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name ;
		System.out.println("enter string data : ");
		name  = sc.nextLine();
		
		
		///
		String s[] = name.split(" "); //s[0] = raman , s[1] = kumar s[2] = sinha 
		
		System.out.println(s.length);

		for(String s1: s){		
			/*
			//raman 
			String ss = s1.substring(0,1).toUpperCase(); //r - R			
			ss+=s1.substring(1, s1.length()).toLowerCase();//AMAN - aman
			
			System.out.print(ss+" ");
			*/
			
			System.out.print(s1.substring(0,1).toUpperCase()+s1.substring(1, s1.length()).toLowerCase()+" ");
						
		}		

	}
}
