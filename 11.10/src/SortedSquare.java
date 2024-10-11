import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        /**
         * Дан сортированный по возрастанию массив целых чисел.
         * Необходимо собрать упорядоченный по вазрастанию массив из квадратов элементов
         *
         * пример: [-3, 2, 4] -> [4, 9, 16]
         */

        int[] array = new int[] {-3, 0, 1, 2, 4};

        array = mapToSortedSquareGoodSolution(array);

        System.out.println(Arrays.toString(array));

    }

    // Bad solution - сложность алгоритма ~ O (n log n)
    private static int[] mapToSortedSquareBadSolution(int[] array) {
        // Проход за n итераций O (n)
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*array[i];
        }
        // Сложность сортировки O (n log n)
        Arrays.sort(array);
        return array;
    }

    // Good solution - сложность алгоритма O (n)
    private static int[] mapToSortedSquareGoodSolution(int[] array) {
        // -3, 2, 4
        //
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int [] result = new int[array.length];
        int i = result.length-1;
        while (leftIndex != rightIndex) {
            if(Math.abs(array[leftIndex]) < Math.abs(array[rightIndex])) {
                result[i] = array[rightIndex] * array[rightIndex];
                i--;
                rightIndex--;
            } else {
                result[i] = array[leftIndex] * array[leftIndex];
                i--;
                leftIndex++;
            }
        }
        result[i] = array[leftIndex] * array[leftIndex];
        return result;
    }
}