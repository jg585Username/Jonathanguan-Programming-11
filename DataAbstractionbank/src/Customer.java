import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = 100;

    Customer() {
        //create default constructor
        this("", 0, 0, 0);
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList<>();
        this.withdraws = new ArrayList<>();
        deposit(checkDeposit, CHECKING);
        deposit(savingDeposit, SAVING);
    }

    public void deposit (double amt, String account) {
        //Requires : amount and account
       // Modifies : this.deposits
       // Effects  : adds an entry to the deposits array with amount, current date, account
        deposits.add(new Deposit(amt, currentTime(), account));
    }

    public void withdraw(double amt, String account){
        //Requires : amount and account
       // Modifies : this.withdraws
       // Effects  : adds an entry to the withdraws array with amount, date, account then calls an overdraft check
        withdraws.add(new Withdraw(amt, currentTime(), account));
        checkOverdraft(account);
    }

    private void checkOverdraft(String account){
        //Requires : account
        //Modifies : this.withdraws
        //Effects  : if too much money is taken out account (leaving negative balance), charge an overdraft
        if (returnBalance(account) < 0){
            withdraws.add(new Withdraw(OVERDRAFT, currentTime(), account));
        }
    }

    public double returnBalance(String account) {
       // Requires : account
        //Modifies : none
       // Effects  : whether to charge an overdraft or not
        int sum = 0;

        for (Deposit i : deposits) {
            if (i.getAccount().equals(account)) {
                sum += i.getAmount();
            }
        }
        for (Withdraw i : withdraws) {
            if ( i.getAccount().equals(account) ) {
                sum -= i.getAmount();
            }
        }
        return sum;
    }

    public double returnBalance() {
        return returnBalance(CHECKING) + returnBalance(SAVING);
    }

    private Date currentTime () {
        return new java.util.Date();
    }

    public int getOverdraftFee () {
        return OVERDRAFT;
    }


    //do not modify
    public void displayDeposits () {
        for (Deposit d : deposits) {
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws() {
        for (Withdraw w : withdraws) {
            System.out.println(w);
        }
    }

}