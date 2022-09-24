import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    @Override
    //Requires: nothing
    //Modifies: nothing
    //Effect: strings/puts together important information to display (Deposits)
    public String toString(){
        String sentence = "Withdrawal of: $" + amount + " ";
        String sentence1 = "Date: " + date + " ";
        String sentence2 = "From account: " + account + " ";
        return sentence + sentence1 + sentence2;
    }
    //Requires: nothing
    //Modifies: nothing
    //Effects: returns amount for overdraft method (withdraws)
    public double getAmount() { 
        return amount; 
    }
    //Requires: nothing
    //Modifies: nothing
    //Effects: returns account for overdraft method (withdraws)
    public String getAccount() {
        return account; 
    }
}

