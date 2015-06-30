
public class BankAccount {
	
	int amount=200;
	
	int  depositCash(int amt){
		
		amount=amount+amt;
		//System.out.println("Balannce is" +amount);
		return amount;
		
	}
	
	
	int withdrawCash(int amt) {
		
		amount=amount-amt;
		//System.out.println("Balannce is" +amount);
		return amount;
	}
	
	
	
	
	public int getBalance(){
		
		
		return(amount);
	}

}
