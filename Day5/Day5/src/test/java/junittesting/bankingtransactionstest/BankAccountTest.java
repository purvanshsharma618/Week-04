package junittesting.bankingtransactionstest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.bankingtransactions.BankAccount;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    // Test initial balance setup
    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount(1000);
        assertEquals(1000, account.getBalance(), "Initial balance should be set correctly.");
    }

    // Test deposit functionality
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        assertEquals(700, account.getBalance(), "Balance should increase after deposit.");
    }

    // Test withdrawal functionality
    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance(), "Balance should decrease after withdrawal.");
    }

    // Test withdrawal exceeding balance
    @Test
    void testInsufficientFunds() {
        BankAccount account = new BankAccount(500);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(600));
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    // Test deposit with negative amount
    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount(1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    // Test withdrawal with negative amount
    @Test
    void testNegativeWithdraw() {
        BankAccount account = new BankAccount(1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-200));
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
    }
}
