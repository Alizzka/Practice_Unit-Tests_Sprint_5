package FinalPracticeTask;

import FinalPracticeTask.Animal;
import java.util.*;

public class AnimalFarm {
    private List<String> farmAnimals;
    public AnimalFarm(List<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    // Задание 1: Метод countedAnimals
    public Map<Animal, Integer> countedAnimals() {
        Map<Animal, Integer> animalMap = new HashMap<>();

        for (String farmAnimal : farmAnimals) {
            Animal animal;
            try {
                // Разделяем строку и получаем вид животного
                animal = Animal.valueOf(farmAnimal.split(" ")[0].toUpperCase());
                // Считаем количество каждого вида животного
                Integer currentNumber = animalMap.get(animal);
                animalMap.put(animal, currentNumber == null ? 1 : currentNumber + 1);
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data.%n", farmAnimal);
            }
        }
        return animalMap;
    }

    // Задание 2: Метод uniqueNames
    public Set<String> uniqueNames() {
        Set<String> uniqueNames = new HashSet<>();

        for (String farmAnimal : farmAnimals) {
            try {
                // Разделяем строку и получаем имя животного
                String name = farmAnimal.split(" ")[1];
                uniqueNames.add(name);
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data.%n", farmAnimal);
            }
        }
        return uniqueNames;
    }

    // Задание 3: Метод добавления животных по виду и имени
    public void addFarmAnimal(Animal animal, String name) {
        farmAnimals.add(animal.name() + " " + name);
    }

    // Задание 3: Метод добавления животного только по виду
    public void addFarmAnimal(Animal animal) {
        farmAnimals.add(animal.name() + " N");
    }

    // Задание 3: Метод добавления животного только по имени (вид — NOT_DEFINED)
    public void addFarmAnimal(String name) {
        farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }

    // Задание 4: Переопределение метода toString для вывода животных
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String farmAnimal : farmAnimals) {
            stringBuilder.append(farmAnimal).append("\n");
        }
        return stringBuilder.toString();
    }
}

/*Объяснение:
1. Поле farmAnimals
private List<String> farmAnimals;
- Это поле представляет собой список животных на ферме. Каждая строка в списке содержит информацию о виде животного
и его имени (например, "CAT Murzik").

2. Конструктор AnimalFarm
public AnimalFarm(List<String> farmAnimals) {
    this.farmAnimals = farmAnimals;
}
- Конструктор принимает список строк (животных) в качестве аргумента и инициализирует поле farmAnimals.
Это позволяет задать начальный список животных при создании объекта AnimalFarm.

3.  Метод countedAnimals
Назначение:
- Этот метод возвращает карту (словарь) с подсчетом животных на ферме, сгруппированных по их видам.
Работа метода:
* Создается пустая карта animalMap, которая будет хранить вид животного (Animal) и количество его экземпляров.
* Метод проходит по списку животных farmAnimals. Для каждого животного:
- Строка разбивается на части (по пробелу), чтобы извлечь вид животного.
- Используется метод Animal.valueOf(), чтобы преобразовать строку в элемент перечисления Animal
(например, "CAT" преобразуется в Animal.CAT).
- С помощью метода animalMap.get() проверяется, есть ли уже запись для данного вида животного.
Если есть, увеличивается счетчик, если нет, добавляется запись с числом 1.
* Если строка содержит некорректные данные (например, неправильный формат), в консоль выводится сообщение об ошибке.

4. Метод uniqueNames
Назначение:
- Этот метод возвращает множество (без повторений) уникальных имен животных, встречающихся на ферме.
Работа метода:
- Создается пустое множество uniqueNames, куда будут добавляться уникальные имена.
- Метод проходит по списку животных, разбивая строку на части и извлекая имя (второй элемент строки).
- Имя добавляется в множество. Множество автоматически исключает дубли.
- Если данные некорректны, выводится сообщение об ошибке.

5. Методы addFarmAnimal
Эти методы позволяют добавлять новых животных на ферму различными способами.
* Добавление вида и имени:
- Добавляет животное на ферму, указав вид (например, Animal.CAT) и имя (например, "Murzik")
* Добавление только вида:
- Добавляет животное на ферму с указанным видом, но без имени (имя по умолчанию — "N")
* Добавление только имени:
- Добавляет животное с видом NOT_DEFINED и заданным именем

6. Переопределенный метод toString
Назначение:
- Этот метод возвращает строковое представление всех животных на ферме, каждое животное выводится с новой строки.
Работа метода:
- Создается объект StringBuilder, чтобы эффективно накапливать строки.
- Метод проходит по списку farmAnimals и добавляет каждое животное в строку, разделяя их символом новой строки \n.
- Возвращается итоговая строка, содержащая информацию обо всех животных на ферме.
 */
