import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    @Override
    public String toString(){
        String sentence = "Deposit of: $" + amount + " ";
        String sentence1 = "Date: " + date + " ";
        String sentence2 = "Into account: " + account + " ";
        return sentence + sentence1 + sentence2;
    }

    public double getAmount() {
        return amount;
    }


    public String getAccount() {
        return account;
    }

}
