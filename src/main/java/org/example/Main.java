package org.example;

public class Main {
    public static void main(String[] args) {
        // Task 1
        String[] words = {
                "яблоко", "банан", "апельсин", "яблоко", "киви", "банан",
                "виноград", "груша", "киви", "яблоко", "персик", "манго",
                "виноград", "апельсин", "персик"
        };

        // Создаем объект WordProcessor и запускаем метод processWords
        UniqueWords wordProcessor = new UniqueWords();
        wordProcessor.processWords(words);

        // Разделяем вывод
        System.out.println("\n--- Телефонный справочник ---");

        // Task 2
        // Создаем объект PhoneBook
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи в телефонный справочник
        phoneBook.add("Smith", "123-456-7890");
        phoneBook.add("Jones", "987-654-3210");
        phoneBook.add("Smith", "555-121-3434"); // Adding a second number for Smith
        phoneBook.add("Garcia", "111-222-3333");
        phoneBook.add("Garcia", "444-555-6666");
        // Поиск номеров по фамилии
        System.out.println("Smith's phone numbers: " + phoneBook.get("Smith"));
        System.out.println("Jones's phone numbers: " + phoneBook.get("Jones"));
        System.out.println("Williams's phone numbers: " + phoneBook.get("Williams")); // Testing a last name that does not exist
        System.out.println("Garcia's phone numbers: " + phoneBook.get("Garcia")); // Testing a last name with multiple entries

    }
}