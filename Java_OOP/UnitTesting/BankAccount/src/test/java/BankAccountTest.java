import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testBankAccountStartsWithZeroBalance() {
        BankAccount bankAccount = new BankAccount();
        double balance = bankAccount.getBalance();
        assertEquals(0, balance, 0);
    }

    @Test
    public void testDepositShouldIncreaseAmountCorrectly(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(777);
        assertEquals(777, bankAccount.getBalance(), 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDepositWithNegativeAmount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-777);
//        assertEquals(0, bankAccount.getBalance(), 0);
    }
}
