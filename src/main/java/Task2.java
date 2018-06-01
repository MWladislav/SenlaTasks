import java.util.ArrayList;
import java.util.List;

public class Task2 {

    /**
     * Task 2 from Senla tasks создать программу, которая
     * будет вычислять и выводить на экран сумму, разность,
     * НОК и НОД двух целых чисел, введенных пользователем.
     * @param a первое число
     * @param b второе число
     * @return возвращает список с суммой, разностью, НОК и НОД заданных чисел
     */
    static List<Integer> lcmAndGcd(int a, int b) {
        List<Integer> mass = new ArrayList<Integer>();
        mass.add(a + b);
        mass.add(a - b);
        mass.add(greatestComDiv(a, b));
        mass.add(a * b / mass.get(2));
        return mass;
    }


    static int greatestComDiv(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestComDiv(b, a % b);
        }
    }


}
