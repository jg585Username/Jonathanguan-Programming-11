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
    public String toString(){
        String sentence = "Withdrawal of: $" + amount + " ";
        String sentence1 = "Date: " + date + " ";
        String sentence2 = "From account: " + account + " ";
        return sentence + sentence1 + sentence2;
    }

    public double getAmount() { 
        return amount; 
    }

    public String getAccount() {
        return account; 
    }
}

