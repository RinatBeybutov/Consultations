import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Интерфейс - реализация
        Map<String, String> nameToSurname = new HashMap<>();

        // Кладем пары в мапу
        nameToSurname.put("Key", "Value");
        nameToSurname.put("Name", "Surname");

        // Получение значения по ключу
        String value = nameToSurname.get("Name");

        // Проверка содержания ключа в мапе
        boolean containsWrongKey = nameToSurname.containsKey("WrongKey");

        // Очистка мапы
        nameToSurname.clear();

        // Операция над значеним по ключу
        nameToSurname.put("First", "One");
        nameToSurname.compute("First", (k, v) -> k+v);

        // Перебор всех значений мапы через оболочку Entry<K, V>
        //nameToSurname.stream()
        nameToSurname.put("Key", "Value");
        System.out.println("Вывод значений");
        nameToSurname.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getValue()));


        // ForEach для мапы
        System.out.println("Вывод ключей");
        nameToSurname.forEach((k,v) -> System.out.println(k));

        // Взять из мапы или дефолтное значение
        String defaultValue = nameToSurname.getOrDefault("Wrong Key", "Default");

        // Получение наборов ключей и значений
        Set<String> strings = nameToSurname.keySet();
        Collection<String> values = nameToSurname.values();


        System.out.println();




    }
}