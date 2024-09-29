/*Добавь обработку исключений для случаев:
•	файл не найден — NoSuchFileException;
•	файл найден, но к нему нет доступа. Например, нет разрешения на чтение — AccessDeniedException;
•	для всех остальных ошибок — IOException.
Для первого и второго случаев выведи текст "Проблемы с доступом к файлу", а для последнего —
"Неизвестная ошибка".
Нужно обработать исключения в таком порядке: NoSuchFileException, AccessDeniedException, IOException.
*/

package LessonsTasks;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.AccessDeniedException;

public class Task_10 {
    public static void main(String[] args) {
        try {
            // Путь к несуществующему файлу, чтобы произошло исключение
            Files.lines(Paths.get("Путь до несуществующего файла"), StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (NoSuchFileException exception) {
            System.out.println("Проблемы с доступом к файлу");
        } catch (AccessDeniedException exception) {
            System.out.println("Проблемы с доступом к файлу");
        //Одной строкой два однотипных действия выше
        /*} catch (ExceptionFirstType | ExceptionSecondType exception) {
            System.out.println("Проблемы с доступом к файлу");
        }*/
        } catch (IOException exception) {
            System.out.println("Неизвестная ошибка");
        }
    }
}

