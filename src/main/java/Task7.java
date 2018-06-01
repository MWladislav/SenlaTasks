import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task7 {
    /**
     * Task 7 from Senla tasks: написать программу, которая рандомно
     * генерирует массив 2-ух значных чисел длины N (вводится вручную)
     * и выводит наименьшее и наибольшее число из списка.
     * @param array массив рандомно сгенерированных чисел
     * @return возвращает массив чисел- два числа(максимальный и минимальный элемент)
     */
    public static int[] maxAndMinEl(int[] array){
        int max=IntStream.of(array).max().getAsInt();
        int min=IntStream.of(array).min().getAsInt();
        return new int[]{max,min};
    }
}
