package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем миску с едой
        Bowl bowl = new Bowl(20);

        // Создаем объекты собак и котов
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catVasya = new Cat("Вася");

        // Выполняем действия с собаками и котами
        dogBobik.run(500);
        dogBobik.swim(20);
        catMurzik.run(205);
        catMurzik.swim(5);

        // Коты пытаются поесть из миски
        Cat[] cats = {catMurzik, catVasya};
        for (Cat cat : cats) {
            boolean isSatiated = cat.eat(bowl, 15);
            System.out.println(cat.name + " сытость после еды: " + (isSatiated ? "сыт" : "голоден"));
        }
        // Выводим состояние миски
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());

        // Добавляем еду в миску
        bowl.addFood(25);

        // Коты снова пытаются поесть
        for (Cat cat : cats) {
            boolean isSatiated = cat.eat(bowl, 15);
            System.out.println(cat.name + " сытость после второго приема пищи: " + (isSatiated ? "сыт" : "голоден"));
        }
        // Выводим состояние миски
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());

        // Выводим статистику по созданным объектам
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}