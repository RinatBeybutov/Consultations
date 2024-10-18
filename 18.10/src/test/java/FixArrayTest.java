import org.example.TaskFixArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FixArrayTest {

    /**
     * 1. Создай список слов, заполни его самостоятельно.
     * 2. Метод fix должен:
     * 2.1. удалять из списка строк все слова, содержащие букву "р"
     * 2.2. удваивать все слова содержащие букву "л".
     * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
     * 2.4. с другими словами ничего не делать.
     *
     * public static void main(String[] args) {
     *  ArrayList<String> strings = new ArrayList<String>();
     * strings.add("роза");
     * strings.add("лоза");
     * strings.add("лира");
     *  strings = fix(strings);
     *
     * for (String string : strings) {
     * System.out.println(string);
     * }
     * }
     *
     *  public static ArrayList<String> fix(ArrayList<String> strings) {
     *  //напишите тут ваш код
     *  return null;
     *  }
     */
    @Test
    @DisplayName("Тест изменения списка слов")
    public void test() {

        // Создание входных данных
        List<String> input = List.of("ррр", "ллл", "рррллл");

        // Вызов тестируемого метода
        List<String> actual = TaskFixArray.fix(input);

        // Создание эталонного объекта для сравнения
        List<String> expected = List.of("лллллл", "рррллл");

        // Сравнение результата работы программы и эталонного
        // объекта
        Assertions.assertIterableEquals(expected, actual);

    }
}
