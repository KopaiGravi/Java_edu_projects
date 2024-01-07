# Cinema Booking System

Це простий додаток для кінотеатру, який дозволяє бронювати та скасовувати місця в різних залах.

## Встановлення

Для встановлення проекту використовуйте Maven. Виконайте команду:

bash
mvn clean install
Використання
Основний клас додатку - Cinema, який має методи для бронювання, скасування бронювання, перевірки доступності та виводу схеми розміщення місць.

java
Copy code
public static void main(String[] args) 
{
    Cinema cinema = new Cinema();
    cinema.bookSeats(2, 3, new int[]{5, 6, 7});
    cinema.bookSeats(2, 3, new int[]{6, 7, 8});
    cinema.cancelBooking(2, 3, new int[]{6, 7, 8});
    boolean isAvailable = cinema.checkAvailability(2, 3);
    System.out.println("Is 3 consecutive seats available in Hall 2? " + isAvailable);
    cinema.printSeatingArrangement(2);
}
Тестування
Тестування реалізовано за допомогою JUnit. Впевніться, що у вас встановлено JUnit 4.x або вище.

Виконайте тести за допомогою команди:

bash
Copy code
mvn test
