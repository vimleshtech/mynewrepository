package exeInteraction;

import java.util.HashMap;
import java.util.Scanner;

public class startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		excelReader obj = new excelReader();
		
		HashMap<Integer, testcase> data = 	obj.readExcel();
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key to be search :");
		int key = sc.nextInt();
		
		testcase t = 	data.get(key);
		
		System.out.println(t.name+"\t"+t.pwd+"\t"+t.desc);
			
		
	}

}
