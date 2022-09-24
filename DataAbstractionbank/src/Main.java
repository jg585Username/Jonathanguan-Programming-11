import java.text.DateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
public class Main { //display

    public static void main(String[] args) {
        Customer demo = new Customer(); //lets the customer know nothing has been done at this time (filler)
        demo.deposit(400, Customer.CHECKING);
        demo.deposit(500, Customer.SAVING);
        demo.displayDeposits();
        System.out.println("Updating activity...");
        System.out.println();
        demo.withdraw(400, Customer.CHECKING);
        demo.withdraw(500, Customer.SAVING);
        demo.displayWithdraws();
        //In the rubric it didn't say date needed to be changeable so I did not do that, instead just used current date for simplicity

    }
}
