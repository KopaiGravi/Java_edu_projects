package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void testCreateAccount() throws NegativeAmountException {
        Bank bank = new Bank();
        BankAccount account = bank.createAccount("John Doe", 1000);
        assertEquals("John Doe", account.getAccountName());
        assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test(expected = NegativeAmountException.class)
    public void testCreateAccountWithNegativeInitialDeposit() throws NegativeAmountException {
        Bank bank = new Bank();
        bank.createAccount("John Doe", -100);
    }

    @Test
    public void testTransferMoney() throws NegativeAmountException, InsufficientFundsException, AccountNotFoundException {
        Bank bank = new Bank();
        BankAccount account1 = bank.createAccount("John Doe", 1000);
        BankAccount account2 = bank.createAccount("Jane Doe", 500);

        bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 200);

        assertEquals(800, account1.getBalance(), 0.001);
        assertEquals(700, account2.getBalance(), 0.001);
    }

    @Test(expected = NegativeAmountException.class)
    public void testTransferMoneyWithNegativeAmount() throws NegativeAmountException, InsufficientFundsException, AccountNotFoundException {
        Bank bank = new Bank();
        BankAccount account1 = bank.createAccount("John Doe", 1000);
        BankAccount account2 = bank.createAccount("Jane Doe", 500);

        bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), -200);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testTransferMoneyWithInsufficientFunds() throws NegativeAmountException, InsufficientFundsException, AccountNotFoundException {
        Bank bank = new Bank();
        BankAccount account1 = bank.createAccount("John Doe", 100);
        BankAccount account2 = bank.createAccount("Jane Doe", 500);

        bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 200);
    }

    @Test(expected = AccountNotFoundException.class)
    public void testTransferMoneyWithNonExistingAccount() throws NegativeAmountException, InsufficientFundsException, AccountNotFoundException {
        Bank bank = new Bank();
        BankAccount account1 = bank.createAccount("John Doe", 1000);

        bank.transferMoney(account1.getAccountNumber(), 999, 200);
    }
}
