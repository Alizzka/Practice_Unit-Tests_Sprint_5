/*Представь, что тебе нужно накормить котят: они должны заходить на кухню и уходить, когда поели.
Создай список kittensInTheKitchen. В нём будут храниться клички котят, которые пришли на кухню:
Пушок, Снежок, Черныш, Ушастик и Рыжик. Проверь, что никто из них не прокрался на кухню до тебя.
Добавь клички котят в список и проверь, сколько их теперь на кухне. Удаляй котят из списка по инструкции
в коде. */

package LessonsTasks;
import java.util.ArrayList;

public class Task_1 {

    public static void main(String[] args) {
        // Создай список kittensInTheKitchen
        ArrayList<String> kittensInTheKitchen = new ArrayList<>();
        // Проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // Если на кухне есть котята, выведи их количество
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // Добавь в список каждого котёнка
        kittensInTheKitchen.add("Пушок");
        kittensInTheKitchen.add("Снежок");
        kittensInTheKitchen.add("Черныш");
        kittensInTheKitchen.add("Ушастик");
        kittensInTheKitchen.add("Рыжик");
        // Проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // Выведи количество котят
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // Удали Пушка из списка по индексу
        kittensInTheKitchen.remove(0);
        // Удали Снежка из списка по имени
        kittensInTheKitchen.remove("Снежок");

        // Проверь, пропал ли Снежок из списка
        if (kittensInTheKitchen.contains("Снежок")) {
            System.out.println("Снежок ещё на кухне");
        } else {
            System.out.println("Снежок уже ушёл");
        }
        // Удали Черныша из списка по имени
        kittensInTheKitchen.remove("Черныш");
        // Проверь, пропал ли Черныш из списка
        if (kittensInTheKitchen.contains("Черныш")) {
            System.out.println("Черныш ещё на кухне");
        } else {
            System.out.println("Черныш уже ушёл");
        }
        // Удали оставшихся котят из списка
        kittensInTheKitchen.clear();

        // Проверь, сколько теперь котят на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
    }
}


