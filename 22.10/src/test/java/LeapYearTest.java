import org.example.LeapYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LeapYearTest {

    /**
     * Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год) 
     * , будет определять количество дней в году. Результат вывести на экран в следующем виде:
     * количество дней в этом году: x
     * , где
     * х - 366 для високосного года,
     * х - 365 для обычного года.
     *
     * Подсказка:
     * В високосном году - 366 дней, тогда как в обычном - 365.
     * 1) если год делится без остатка на 400 это високосный год;
     * 2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
     * 3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
     * 4) все оставшиеся года невисокосные.
     * Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
     * Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
     * Годы 2100, 2200 и 2300 - не високосные.
     */
    @Test
    public void leapYearTest0() {
        boolean actual = LeapYear.isLeapYear(1600);
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void leapYearTest1() {
        boolean actual = LeapYear.isLeapYear(1700);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void leapYearTest2() {
        boolean actual = LeapYear.isLeapYear(2003);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void leapYearTest3() {
        boolean actual = LeapYear.isLeapYear(2004);
        Assertions.assertEquals(true, actual);
    }


    @ParameterizedTest
    @MethodSource("getYearData")
    public void leapYearTest(int year, boolean expected) {
        boolean actual = LeapYear.isLeapYear(year);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> getYearData() {
        return Stream.of(
                Arguments.of(1600, true),
                Arguments.of(1700, false),
                Arguments.of(2000, true),
                Arguments.of(2003, false),
                Arguments.of(2004, true),
                Arguments.of(2005, false)
        );
    }
}
