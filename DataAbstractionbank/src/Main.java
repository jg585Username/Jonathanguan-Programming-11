
import java.util.Date;
public class Main { 

    public static void main(String[] args) {
        //displaying
        Deposit checkingDeposit = new Deposit(500.0, new Date(), "Checking");
        Deposit savingDeposit = new Deposit(200.0, new Date(), "Saving");
        System.out.println(checkingDeposit);
        System.out.println(savingDeposit);
        
        Withdraw checkingWithdraw = new Withdraw(500.0, new Date(), "Checking");
        Withdraw savingWithdraw = new Withdraw(200.0, new Date(), "Saving");
        System.out.println(checkingWithdraw);
        System.out.println(savingWithdraw);
        //In the rubric it didn't say date needed to be changeable so I did not do that, instead just used current date for simplicity
    }
}
