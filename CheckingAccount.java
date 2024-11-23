package sixthlab;

public class CheckingAccount extends BankAccount{

	    private double FEE = 0.15;

	    public CheckingAccount(String theName, double theInitialBalance) {
	        super(theName, theInitialBalance); 
	        setAccountNumber(getAccountNumber() + "-10"); 
	    }

	    @Override
	    public boolean withdraw(double balance) {
	        balance += FEE;
	        return super.withdraw(balance);
	    }
	}

