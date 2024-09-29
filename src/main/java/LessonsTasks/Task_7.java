/*Чтобы добавить несколько вариантов сортировки, можно создать разные реализации интерфейса Comparator.
Например, товар в интернет-магазине представлен классом Item. У него есть поля: name (название),
price (цена) и popularity (популярность). Товары нужно отсортировать и по названию, и по цене.
Чтобы применить обе сортировки, нужно:
•	создать два компаратора;
•	дописать к вызову sort() метод thenComparing()
 */

package LessonsTasks;
import java.util.ArrayList;
import java.util.Comparator;

public class Task_7 {
    private final String name;
    private final int price;
    private final int popularity;
    public Task_7(String name, int price, int popularity) {
        this.name = name;
        this.price = price;
        this.popularity = popularity;
    }
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", popularity=" + popularity +
                '}';
    }
    // компаратор по названию товара:
    public static final Comparator<Task_7> ITEM_NAME_CASE_INSENSITIVE_COMPARATOR = new Comparator<Task_7>() {
        @Override
        public int compare(Task_7 o1, Task_7 o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.name, o2.name);
        }
    };
    // компаратор по цене товара по возрастанию:
    public static final Comparator<Task_7> ITEM_PRICE_COMPARATOR = new Comparator<Task_7>() {
        @Override
        public int compare(Task_7 o1, Task_7 o2) {
            return o1.price - o2.price;
        }
    };
    public static void main(String[] args) {
        ArrayList<Task_7> items = new ArrayList<>();
        items.add(new Task_7("Рубашка", 6, 4));
        items.add(new Task_7("Носки", 5, 10));
        items.add(new Task_7("Носки", 7, 9));
        items.add(new Task_7("Носки", 3, 13));
        System.out.println(items);        items.sort(ITEM_NAME_CASE_INSENSITIVE_COMPARATOR.thenComparing(ITEM_PRICE_COMPARATOR));
        System.out.println(items);
    }
}

