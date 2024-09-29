package FinalPracticeTask;

import FinalPracticeTask.Animal;
import FinalPracticeTask.AnimalFarm;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаём изменяемый список животных на ферме
        AnimalFarm farm = new AnimalFarm(new ArrayList<>(Arrays.asList("DOG Жучка", "CAT Мурка", "COW Бурёнка", "DOG Бобик", "HORSE Гром", "CAT")));

        // Тест Задание 1: Вызываем метод countedAnimals для подсчета животных
        System.out.println("Количество животных по видам: " + farm.countedAnimals());

        // Тест Задание 2: Вызываем метод uniqueNames для получения уникальных имён
        System.out.println("Уникальные имена животных: " + farm.uniqueNames());

        // Тест Задание 3: Добавляем новых животных для каждого вида
        farm.addFarmAnimal(Animal.DOG, "Рекс");
        farm.addFarmAnimal(Animal.COW, "Дуня");
        farm.addFarmAnimal(Animal.HORSE, "Шторм");
        farm.addFarmAnimal(Animal.CAT, "Барсик");
        farm.addFarmAnimal(Animal.HORSE); // Имя животного будет N
        farm.addFarmAnimal("Пушистик"); // Вид животного NOT_DEFINED

        // Тест Задание 4: Выводим обновлённый список животных с помощью toString
        System.out.println("Обновлённый список животных на ферме:");
        System.out.println(farm);
    }
}


