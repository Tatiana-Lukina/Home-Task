package org.example;

import java.util.*;

public class PhoneBook {

    // HashMap для хранения фамилий и списка телефонных номеров
    private final Map<String, List<String>> phoneBook;

    // Конструктор для инициализации HashMap
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи в телефонный справочник
    public void add(String lastName, String phoneNumber) {
        // Получаем список телефонов для данной фамилии, если он существует, или создаем новый
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для получения списка номеров телефонов по фамилии
    public List<String> get(String lastName) {
        // Возвращаем список номеров телефонов по фамилии или пустой список, если фамилия не найдена
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
}