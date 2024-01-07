# Palindrome Checker

Цей проект містить реалізацію функції для перевірки, чи є слово паліндромом в мові програмування Java.

## Використання

1. Скачайте або клонуйте репозиторій:

git clone https://github.com/your-username/palindrome-checker.git
Відкрийте проект у вашому обраному інтегрованому середовищі розробки для Java.

Запустіть PalindromeChecker клас для перевірки роботи функції на прикладах.

java
Copy code
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(PalindromeChecker.isPalindrome("level")); // true
        System.out.println(PalindromeChecker.isPalindrome("hello")); // false
    }
}
Тести
Проект включає тести з використанням фреймворку JUnit для перевірки коректності функції isPalindrome. Щоб запустити тести, використовуйте ваше обране інтегроване середовище або використовуйте Maven:

bash
Copy code
mvn test
Залежності
Даний проект використовує фреймворк JUnit для тестування. Додайте його у ваш проект, якщо він відсутній.

xml
Copy code
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13</version>
        <scope>test</scope>
    </dependency>
</dependencies>
