/*В хеш-таблице dinner хранится список блюд на обед. Удали из неё элементы: следуй инструкции в коде.*/

package LessonsTasks;
import java.util.HashMap;

public class Task_4 {
    public static void main(String[] args) {
        HashMap<String, String> dinner = new HashMap<>();
        dinner.put("Салат", "Оливье");
        dinner.put("Первое", "Борщ");
        dinner.put("Второе", "Котлеты");
        dinner.put("Гарнир", "Пюре");
        dinner.put("Напиток", "Кисель");
        // выведи хеш-таблицу на экран, чтобы проверить список блюд
        System.out.println(dinner);
        // удали из хеш-таблицы салат
        dinner.remove("Салат");
        // выведи хеш-таблицу на экран, чтобы проверить, что салата нет
        System.out.println(dinner);
        // удали из хеш-таблицы первое блюдо
        dinner.remove("Первое");
        // выведи хеш-таблицу на экран, чтобы проверить, что первого нет
        System.out.println(dinner);
        // очисти хеш-таблицу
        dinner.clear();
        // выведи хеш-таблицу на экран, чтобы проверить, что ничего не осталось
        System.out.println(dinner);
    }
}


