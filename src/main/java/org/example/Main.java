package org.example;

public class Main {
    public static void main(String[] args) {
        printEmployeeInfo();  //Задание 1,2
        printParkInfo();     //Задание 3
    }

    private static void printEmployeeInfo() {
        // Создать массив из 5 сотрудников
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван", "Инженер", "ivanov@mail.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Петров Петр", "Менеджер", "petroov@mail.ru", "89123589537", 45000, 28);
        employeesArray[2] = new Employee("Сидоров Сергей", "Директор", "sidorov@mail.ru", "89124586554", 70000, 38);
        employeesArray[3] = new Employee("Кирилов Клим", "Разработчик", "kirillv@mail.ru", "89054523117", 40000, 26);
        employeesArray[4] = new Employee("Михайлов Михаил", "Тестировщик", "mikhailov@mail.ru", "89123569554", 34000, 29);

        for (Employee employee : employeesArray) {
            employee.printInfo();

        }

    }

    private static void printParkInfo() {
        Park amusementPark = new Park("Веселый парк", 3);
        amusementPark.addAttraction(0, "Американские горки", "10:00-22:00", 500);
        amusementPark.addAttraction(1, "Колесо обозрения", "10:00-22:00", 500);
        amusementPark.addAttraction(2, "Паровозик", "10:00-22:00", 500);
        amusementPark.printAttractions();

    }
}


