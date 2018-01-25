package polyModule;

public class SavingAccount extends BankAccount {

	String aType;
	final int min = 10000;
	
	public void newAccount()
	{
		this.newAccount();
		
		System.out.print("Enter Phone #:");
		aType=sc.next();
		
		if(amout<min)
		{
			System.out.println("Account cannot be open, min. balance must be 10000 or above");
			System.exit(0);
		}
		
	}
	//-deposit()
	//-withdrawn()
	public void details()
	{
		System.out.print("AC #:"+AccountNo);
		System.out.print("Name #:"+Name);
		System.out.print("Amount :"+amout);
		System.out.print("PAN #:"+PAN);
		System.out.print("PHone  #:"+Phone);
		System.out.print("Email:"+Email);
		
	}
	
}
