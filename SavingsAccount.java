package sixthlab;

public class SavingsAccount extends BankAccount {

    private double rate = 0.025; 
    private int savingsnumber = 0;           
    private String accountnumber;            

    public SavingsAccount(String theName, double theInitialBalance) {
        super(theName, theInitialBalance);
        accountnumber = super.getAccountNumber() + "-" + savingsnumber; 
    }

    public void postInterest() {
        double theMonthlyInterest = getBalance() * (rate / 12); 
        deposit(theMonthlyInterest); 
    }

    @Override
    public String getAccountNumber() {
        return accountnumber;
    }

    public SavingsAccount(SavingsAccount theOA, double theIB) {
        super(theOA, theIB);
        this.savingsnumber = theOA.savingsnumber + 1; 
        accountnumber = super.getAccountNumber() + "-" + this.savingsnumber;
    }
}
