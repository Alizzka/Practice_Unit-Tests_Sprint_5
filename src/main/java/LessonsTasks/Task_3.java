/*Представь, что нужно рассчитать общий вес котят из хеш-таблицы.
Создай переменную kittenWeightsSum со значением 0. В цикле for each получи вес каждого котёнка
oneKittenWeight и добавь его к общему весу
 */

package LessonsTasks;
import java.util.HashMap;

public class Task_3 {
    public static void main(String[] args) {
        HashMap<String, Double> kittenWeights = new HashMap<>();
        kittenWeights.put("Пушок", 1.62);
        kittenWeights.put("Снежок", 1.91);
        kittenWeights.put("Черныш", 1.96);
        kittenWeights.put("Ушастик", 2.02);
        kittenWeights.put("Рыжик", 1.88);
        // создай переменную kittenWeightsSum со значением 0
        double kittenWeightsSum = 0;
        // получи вес каждого котёнка oneKittenWeight
        // и прибавь его к переменной суммарного веса через if
        for (Double oneKittenWeight : kittenWeights.values()) {
            if ((kittenWeightsSum = kittenWeightsSum + oneKittenWeight) >= 0) {
                // Условие if выполнится всегда, поскольку kittenWeightsSum всегда неотрицательна
                // либо  kittenWeightsSum += oneKittenWeight; вместо if
            }
        }
        // выведи на экран суммарный вес котят
        System.out.println("Суммарный вес котят: " + kittenWeightsSum + " кг");
    }
}


