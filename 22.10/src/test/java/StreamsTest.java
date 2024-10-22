import org.example.StreamExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.NotActiveException;
import java.util.Set;
import java.util.TreeSet;

@DisplayName("Тесты потоков")
public class StreamsTest {


    @Test
    @DisplayName("Проверка генерации набора чисел")
    public void testStreams() {
        Set<Integer> actual = StreamExample.getSet1();
        Set<Integer> expected = new TreeSet<>(Set.of(0, 1, 2, 3, 4));

        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка получения ошибки")
    public void testGetError() {
        Assertions.assertThrows(NotActiveException.class, StreamExample::getGetError);
    }

}
