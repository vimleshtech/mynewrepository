package day2;

public class IncomeTax extends dcalc {


	int hra;
	int basic;
	int other;
	//int total ;
	
	public int getSal(int hra, int basic, int other)
	{
		this.hra= hra;
		this.basic = basic;
		this.other = other;
				
		this.total = hra+basic+other;
	
		super.total = hra+basic+other;
		total  =22;
		
		super.add(111, 22);
		
		this.show();
		
		return total;
	}
	public void  show() {
		
		System.out.println("Basic : "+basic);
		System.out.println("HRA : "+hra);
		System.out.println("Other : "+other);
		System.out.println("Total Salary : "+total);
		
	}
	
}
