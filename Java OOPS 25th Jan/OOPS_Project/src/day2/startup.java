package day2;

public class startup {

	public static void main(String[] args) {

		//clac o = new clac();
		//dcalc o = new dcalc();
		IncomeTax o = new IncomeTax();
		
		o.add(111, 22);
		o.sub(333, 33);
		
		int out = o.mul(22, 3);
		System.out.println(out);
		
		o.div(11,2);
		o.add(111.333, 33.444);
				
		int sal = o.getSal(20000, 40000, 20000);
		System.out.println("monthly salary : "+sal);
		out  = o.mul(sal, 12);
		System.out.println("PA salary : "+out);
		
		
		//o.show();
		
		

	}

}
