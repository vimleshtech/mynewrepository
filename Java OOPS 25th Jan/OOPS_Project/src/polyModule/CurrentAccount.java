package polyModule;

public class CurrentAccount extends SavingAccount {

	String Type_of_Organization; 
	String RegistrationNO;
	String PAN_of_Oraganiation; 
	String Office_Address;
	

	public void newAccount()
	{
		super.newAccount();
		
		System.out.print("Enter Type_of_Organization #:");
		Type_of_Organization=sc.next();
		
		
		System.out.print("Enter RegistrationNO #:");
		RegistrationNO=sc.next();
		
		
		System.out.print("Enter PAN_of_Oraganiation #:");
		PAN_of_Oraganiation=sc.next();
		
		
		System.out.print("Enter Office_Address #:");
		Office_Address=sc.next();
		
	}
	
	public void details()
	{
		super.details();
		
		System.out.print("PAN_of_Oraganiation #:"+PAN_of_Oraganiation);
		System.out.print("Office_Address #:"+Office_Address);
		System.out.print("Type_of_Organization :"+Type_of_Organization);
		System.out.print("RegistrationNO #:"+RegistrationNO);
		
		
	}
}
