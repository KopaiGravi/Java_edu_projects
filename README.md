# Електронна Комерція

Цей проект реалізує базову систему електронної комерції, що дозволяє користувачам додавати продукти до кошика, видаляти їх, робити замовлення та перевіряти статус замовлення.

## Сутності

1. **Product**: Повинен мати атрибути, такі як `id`, `name`, `price`.
2. **Cart**: Повинен зберігати список продуктів та надавати функціональність додавання та видалення продуктів.
3. **Order**: Повинен мати атрибути, такі як `orderId`, `products`, `status`.

## Функціональність

- Додавання/видалення продуктів до/з кошика.
- Розміщення замовлення на товари в кошику.
- Отримання статусу конкретного замовлення.

## Тестування JUnit

Проект містить тестові випадки JUnit для перевірки правильності функціональностей. Використовується бібліотека Mockito для заміни реальних об'єктів тестовими об'єктами.

## Запуск тестів

1. Встановіть Maven, якщо він не встановлений.
2. Використовуйте команду `mvn test` для виконання тестів.

## Вимоги до Середовища

- Java 8 або новіша.
- Maven для збірки та тестування проекту.
