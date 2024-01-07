package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank();

            BankAccount account1 = bank.createAccount("John Doe", 1000);
            BankAccount account2 = bank.createAccount("Jane Doe", 500);

            System.out.println("Account 1 Summary:\n" + account1.getAccountSummary());
            System.out.println("Account 2 Summary:\n" + account2.getAccountSummary());

            bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 200);

            System.out.println("\nAfter Transfer:");
            System.out.println("Account 1 Summary:\n" + account1.getAccountSummary());
            System.out.println("Account 2 Summary:\n" + account2.getAccountSummary());
        } catch (NegativeAmountException | InsufficientFundsException | AccountNotFoundException e) {
            e.printStackTrace();
        }
    }
}