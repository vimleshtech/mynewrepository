package polyModule;

public class startup {

	public static void main(String[] args) {
		
		
		/* 
		SavingAccount so = new SavingAccount();
		CurrentAccount co = new CurrentAccount();
		
		so.newAccount(); //parent class
		so.details();//parent class
		
		//overlaping of memory 
		so = co;
		so.newAccount(); //child  class
		so.details();//child  class
		*/
		
		//SavingAccount so = new CurrentAccount();

		caller(new SavingAccount());
		caller(new CurrentAccount());
		
	}
	
	public static void  caller(SavingAccount o)
	{
		o.newAccount();
		o.details();
		
		if(o instanceof SavingAccount)
		{
			//o.abcd();
		}
		if(o instanceof CurrentAccount)
		{
			//o.xyz();
		}
		
		
	}

}
