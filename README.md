# Банківська Система

Ця програма імітує просту банківську систему і дозволяє створювати рахунки, здійснювати фінансові операції та отримувати інформацію про рахунки.

## Класи

1. `BankAccount`: Клас, що представляє банківський рахунок.
    - Методи:
        - `deposit(double amount)`: Здійснює внесення грошей на рахунок.
        - `withdraw(double amount)`: Здійснює зняття грошей з рахунку.
        - `getBalance()`: Повертає поточний баланс рахунку.
        - `getAccountSummary()`: Повертає резюме рахунку.
        - `getAccountName()`: Повертає назву власника рахунку.
        - `getAccountNumber()`: Повертає номер рахунку.

2. `Bank`: Клас, що управляє колекцією банківських рахунків.
    - Методи:
        - `createAccount(String accountName, double initialDeposit)`: Створює новий рахунок з заданою назвою та початковим депозитом.
        - `findAccount(int accountNumber)`: Знаходить рахунок за його номером.
        - `transferMoney(int fromAccountNumber, int toAccountNumber, double amount)`: Здійснює переказ грошей між рахунками.

## Винятки

1. `NegativeAmountException`: Виняток, який викидається, якщо спроба виконати операцію з від'ємною сумою.
2. `InsufficientFundsException`: Виняток, який викидається при недостатньому балансі для здійснення операції зняття грошей.
3. `AccountNotFoundException`: Виняток, який викидається, якщо рахунок не знайдено.

## Запуск

Використовуйте клас `Main` для демонстрації роботи системи та перевірки функціоналу.

java
public class Main {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank();

            // Ваші фінансові операції тут...

        } catch (NegativeAmountException | InsufficientFundsException | AccountNotFoundException e) {
            e.printStackTrace();
        }
    }
}
Вимоги до використання
Проект написаний на Java. Переконайтеся, що у вас встановлено JDK для компіляції та виконання коду.
