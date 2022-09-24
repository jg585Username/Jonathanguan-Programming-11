import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    Customer customerTester;
    double testAmount;
    double startBalance;
    String testAccount;

    String CHECKING = "Checking"; //instead of using getters setters just do this
    String SAVING = "Saving";

    @Before
    public void before() {
        startBalance = 85.00;
        testAmount = 110.00;
        testAccount = CHECKING;
        customerTester = new Customer("customerTester", 56455684, startBalance, startBalance);
    }

    @Test
    public void deposit() {
        customerTester.deposit(testAmount, testAccount);

        assertEquals((testAmount + startBalance), customerTester.returnBalance(testAccount), 0.01); //minimum difference of a penny
    }

    @Test
    public void withdraw() {
        customerTester.deposit(testAmount, testAccount); // avoid triggering overdraft
        customerTester.withdraw(testAmount, testAccount);

        assertEquals(startBalance, customerTester.returnBalance(testAccount), 0.01);
    }

    @Test
    public void checkOverdraft() {
        customerTester.withdraw(testAmount, testAccount);

        double expected = ((double)customerTester.getOverdraftFee() + testAmount) * -1;
        assertEquals((expected + startBalance), customerTester.returnBalance(testAccount), 0.01);
    }

    @Test
    public void printDeposit(){
        Withdraw transaction = new Withdraw(100, null, null);

        String expected = "Withdrawal of: $100.0 Date: null From account: null ";
        assertEquals(expected, transaction.toString());
    }

    @Test
    public void printWithdraw(){
        Deposit transaction = new Deposit(100, null, null);

        String expected = "Deposit of: $100.0 Date: null Into account: null ";
        assertEquals(expected, transaction.toString());
    }

    @Test
    public void checkBalance(){
        customerTester.deposit(testAmount, CHECKING);
        customerTester.deposit(testAmount, SAVING);

        assertEquals((startBalance + testAmount), customerTester.returnBalance(CHECKING), 0.01);
        assertEquals((startBalance + testAmount), customerTester.returnBalance(SAVING), 0.01);

        double expected = (startBalance * 2) + (testAmount * 2);
        assertEquals(expected, customerTester.returnBalance(), 0.01);
    }
}
