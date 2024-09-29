#### 1. Пакет LessonsTasks:
Задания описаны в самих классах, перед кодом.
#### 2. Пакет FinalPracticeTask:
### Задание:
#### Подготовка
Создай в IDE новый проект и собери структуру классов:

•	Класс-перечисление Animal (животное). В нём есть такие виды животных: CAT (кошка), DOG (собака), HORSE (лошадь), COW (корова). Также добавь вид NOT_DEFINED (не определён) — он пригодится, чтобы реализовать функциональность в заданиях.

•	Класс AnimalFarm (ферма). У него одно поле — список строк farmAnimals. Создай конструктор с этим параметром. В этом списке лежат данные по всем животным на ферме в виде двух слов, разделенных пробелом: Вид_животного Имя_животного. Например, DOG Жучка.

#### Задание 1
В классе AnimalFarm реализуй метод countedAnimals. Он должен по полю farmAnimals формировать хеш-таблицу, в которой ключ — это вид животного (Animal), а значение — количество животных этого вида на ферме.

Если какая-то строка в списке не содержит первым словом валидный вид животного, метод должен вывести в консоль фразу: Please correct string [Здесь вывести полностью ошибочную строку]. Incorrect input data.

Метод возвращает сформированную хеш-таблицу.

#### Задание 2
В классе AnimalFarm реализуй метод uniqueNames. Он должен возвращать коллекцию всех уникальных имён животных на ферме. Подходящий тип коллекции подбери самостоятельно.
Если в какой-то строке списка нет второго слова, метод должен вывести в консоль фразу: Please correct string [Здесь вывести полностью ошибочную строку]. Incorrect input data.

#### Задание 3
В классе AnimalFarm реализуй три метода для разных вариантов добавления нового животного на ферму:

1.	по переданному виду животного и имени;
1.	по переданному виду животного. В этом случае имя животного равно N;
2.	по переданному имени животного. В этом случае вид животного равен NOT_DEFINED.

#### Задание 4
В классе AnimalFarm переопредели метод toString так, чтобы он выводил информацию по животным на ферме в виде:

Вид_животного Имя_животного

Вид_животного Имя_животного

Вид_животного Имя_животного 

