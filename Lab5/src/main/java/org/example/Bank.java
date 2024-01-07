package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public BankAccount createAccount(String accountName, double initialDeposit) throws NegativeAmountException {
        if (initialDeposit < 0) {
            throw new NegativeAmountException("Initial deposit must be non-negative");
        }

        int accountNumber = accounts.size() + 1;
        BankAccount newAccount = new BankAccount(accountNumber, accountName, initialDeposit);
        accounts.add(newAccount);
        return newAccount;
    }

    public BankAccount findAccount(int accountNumber) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new AccountNotFoundException("Account with number " + accountNumber + " not found");
    }

    public void transferMoney(int fromAccountNumber, int toAccountNumber, double amount)
            throws NegativeAmountException, InsufficientFundsException, AccountNotFoundException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount must be non-negative");
        }

        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
