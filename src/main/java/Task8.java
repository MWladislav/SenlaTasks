import java.util.ArrayList;

public class Task8 {

    /**
     * Task 8 from Senla tasks: написать программу, которая в последовательности от 0 до N,
     * находит все числа-палиндромы (зеркальное значение равно оригинальному).
     * Длина последовательности вводится вручную и не должна превышать 100
     * @param n конечный элемент последовательности
     * @return возвращает массив чисел-палиндромов
     */
    public static ArrayList<String> palidroms(int n){
        ArrayList<String> list=new ArrayList();
        for (int i = 0; i < n; i++) {
            String iStr = String.valueOf(i);
            String iStrReverse = new StringBuilder(iStr).reverse().toString();
            if (iStr.equals(iStrReverse)) {
                list.add(iStr);
            }
        }
        return list;
    }
}
