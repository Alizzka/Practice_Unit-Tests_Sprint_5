/*В хеш-таблице kittenWeightFood нужно сохранить информацию о котятах:
Кличка	Вес, кг	Съедает корма в день, кг
Пушок	1.62	0.095
Снежок	1.91	0.092
Черныш	1.96	0.098
Ушастик	2.02	0.105
Рыжик	1.88	0.098
Создай список каждому котёнку и сохрани в нём вес и количество корма. Добавь эти данные в хеш-таблицу:
ключ — кличка котёнка, а значение — список с информацией о нём. Выведи хеш-таблицу на экран. */

package LessonsTasks;
// импортируй хеш-таблицу
import java.util.HashMap;
// импортируй список
import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        // создай хеш-таблицу
        HashMap<String, ArrayList<Double>> kittenWeightFood = new HashMap<>();
        // создай список для информации о Пушке
        ArrayList<Double> pushok = new ArrayList<>();
        // добавь в список вес Пушка
        pushok.add(1.62);
        // добавь в список количество корма, которое съел Пушок
        pushok.add(0.095);
        // добавь информацию о Пушке в хеш-таблицу
        kittenWeightFood.put("Пушок",pushok);

        // создай список для информации о Снежке
        ArrayList<Double> snezhok = new ArrayList<>();
        // добавь в список вес Снежка
        snezhok.add(1.91);
        // добавь в список количество корма, которое съел Снежок
        snezhok.add(0.092);
        // добавь информацию о Снежке в хеш-таблицу
        kittenWeightFood.put("Снежок",snezhok);

        // создай список для информации о Черныше
        ArrayList<Double> chernysh = new ArrayList<>();
        // добавь в список вес Черныша
        chernysh.add(1.96);
        // добавь в список количество корма, которое съел Черныш
        chernysh.add(0.098);
        // добавь информацию о Черныше в хеш-таблицу
        kittenWeightFood.put("Черныш",chernysh);

        // создай список для информации об Ушастике
        ArrayList<Double> ushastik = new ArrayList<>();
        // добавь в список вес Ушастика
        ushastik.add(2.02);
        // добавь в список количество корма, которое съел Ушастик
        ushastik.add(0.105);
        // добавь информацию об Ушастике в хеш-таблицу
        kittenWeightFood.put("Ушастик",ushastik);

        // создай список для информации о Рыжике
        ArrayList<Double> ryzhik = new ArrayList<>();
        // добавь в список вес Рыжика
        ryzhik.add(1.88);
        // добавь в список количество корма, которое съел Рыжик
        ryzhik.add(0.098);
        // добавь информацию о Рыжике в хеш-таблицу
        kittenWeightFood.put("Рыжик",ryzhik);

        // выведи хеш-таблицу на экран
        System.out.println(kittenWeightFood);
    }
}



