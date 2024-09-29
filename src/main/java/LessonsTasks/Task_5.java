/*Удали блюда из хеш-таблицы dinner и проверь, что их больше нет. Следуй инструкции в коде. */

package LessonsTasks;
import java.util.HashMap;

public class Task_5 {

    public static void main(String[] args) {
        HashMap<String, String> dinner = new HashMap<>();
        dinner.put("Салат", "Оливье");
        dinner.put("Первое", "Борщ");
        dinner.put("Второе", "Котлеты");
        dinner.put("Гарнир", "Пюре");
        dinner.put("Напиток", "Кисель");
        // выведи хеш-таблицу на экран, чтобы проверить список блюд
        System.out.println(dinner);
        // проверь по ключу, что в обед входит напиток
        System.out.println(dinner.containsKey("Напиток"));
        // удали из хеш-таблицы салат
        dinner.remove("Салат");
        // проверь по ключу, что салата нет
        System.out.println(dinner.containsKey("Салат"));
        // удали из хеш-таблицы первое блюдо
        dinner.remove("Первое");
        // проверь по значению, что борща нет
        System.out.println(dinner.containsValue("Борщ"));
        // очисти хеш-таблицу
        dinner.clear();
        // проверь по ключу, что второго блюда нет
        System.out.println(dinner.containsKey("Второе"));
        // проверь по ключу, что гарнира нет
        System.out.println(dinner.containsKey("Гарнир"));
        // проверь по значению, что киселя нет
        System.out.println(dinner.containsValue("Кисель"));
    }
}

