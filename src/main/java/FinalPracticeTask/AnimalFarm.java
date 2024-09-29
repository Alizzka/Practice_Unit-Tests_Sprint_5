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
