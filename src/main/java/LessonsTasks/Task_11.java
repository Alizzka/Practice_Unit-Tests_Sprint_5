/*Повар решил приготовить десерт с фруктами.
Фрукты нужно подготовить: очистить от косточек. Если это груша Pear, повар должен получить
подсказку "Нужно удалить косточки ложкой". А для любого другого фрукта — "Нужно удалить косточки ножом".
Создай класс Pear и переопредели в нём метод или методы так, чтобы программа печатала:
Нужно удалить косточки ложкой
Фрукт готов к использованию
*/

package LessonsTasks;

public class Task_11 {
    public static void main(String[] args) {
        Pear pear = new Pear();
        pear.processFruit();
    }
}
// Класс Fruit
class Fruit {
    // Метод, который вызывается для обработки фрукта
    public void processFruit() {
        removeStone(); // Вызов метода удаления косточек
        System.out.println("Фрукт готов к использованию");
    }
    // Метод удаления косточек для обычного фрукта
    public void removeStone() {
        System.out.println("Нужно удалить косточки ножом");
    }
}
// Класс Pear, который наследуется от Fruit
class Pear extends Fruit {
    // Переопределение метода удаления косточек для груши
    @Override
    public void removeStone() {
        System.out.println("Нужно удалить косточки ложкой");
    }
}

