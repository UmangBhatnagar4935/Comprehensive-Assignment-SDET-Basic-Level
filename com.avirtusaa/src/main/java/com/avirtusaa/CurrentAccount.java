package com.avirtusaa;



public class CurrentAccount extends Account{
	
	private Double interestCurrentAccountCompound;
	private Double principalBaseAmountCurrent;
	private int timeSavingsAccount;
	
	
	
	public CurrentAccount(Double amountReceived, int timeReceived) {
		
		super(amountReceived);
		this.principalBaseAmountCurrent = amountReceived;
		this.timeSavingsAccount = timeReceived;
		
		
	}
	
	
	
	public Double interestSimple_And_Coumpound_Sum_Total()
	{
		System.out.println("This is dummy implementation");
		System.out.println("This is Current Account");
		
	
		
		Double interestRate = 0.12;
		
		interestCurrentAccountCompound = principalBaseAmountCurrent * timeSavingsAccount * interestRate ;
		
		Double totalAmountPostInterest = principalBaseAmountCurrent + interestCurrentAccountCompound;
		
		System.out.println("This is Simple Interest for Account alonf with the total sum being returned: "+ interestCurrentAccountCompound + " : " + totalAmountPostInterest);
		
		
		
		return interestCurrentAccountCompound;
	}
	

	
	
	

}
