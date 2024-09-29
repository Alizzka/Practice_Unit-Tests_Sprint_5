/*Вспомни таблицу с любимыми игрушками котят:
Кличка котёнка	Любимые игрушки
Пушок	Мяч
Снежок	Бантик
Черныш	Мышка, Носок
Ушастик	Бантик, Клубок
Рыжик	Мяч, Рыбка-пищалка
Все игрушки котят хранятся в списке favoriteToys.
1.	Создай из списка favoriteToys множество, чтобы избавиться от дубликатов.
2.	Посчитай общее количество любимых игрушек в множестве.
3.	Добавь в множество новые игрушки: пакет и коробку.
4.	Проверь, есть ли в множестве бантик и ботинок.
5.	Удали носок из множества.
6.	Выведи множество на экран
*/

package LessonsTasks;
import java.util.ArrayList;
import java.util.HashSet;

public class Task_9 {
    public static void main(String[] args) {
        // создали список всех любимых игрушек
        ArrayList<String> favoriteToys = new ArrayList<>();
        favoriteToys.add("Мяч"); // добавили любимые игрушки Пушка в список
        favoriteToys.add("Бантик"); // добавили любимые игрушки Снежка в список
        favoriteToys.add("Мышка");
        favoriteToys.add("Носок"); // добавили любимые игрушки Черныша в список
        favoriteToys.add("Бантик");
        favoriteToys.add("Клубок"); // добавили любимые игрушки Ушастика в список
        favoriteToys.add("Мяч");
        favoriteToys.add("Рыбка-пищалка"); // добавили любимые игрушки Рыжика в список
        // создай из списка множество любимых игрушек
        HashSet<String> uniqueFavoriteToys = new HashSet<>(favoriteToys);
        // посчитай количество игрушек в множестве
        System.out.println("Разных игрушек у котят: " + uniqueFavoriteToys.size());
        // добавь в множество пакет и коробку
        uniqueFavoriteToys.add("Пакет");
        uniqueFavoriteToys.add("Коробка");
        // проверь, есть ли в множестве "Бантик"
        System.out.println("Бантик есть в списке любимых игрушек: " + uniqueFavoriteToys.contains("Бантик"));
        // проверь, есть ли в множестве "Ботинок"
        System.out.println("Ботинок есть в списке любимых игрушек: " + uniqueFavoriteToys.contains("Ботинок"));
        // убери "Носок" из множества
        uniqueFavoriteToys.remove("Носок");
        // выведи множество на экран
        System.out.println(uniqueFavoriteToys);
    }
}

