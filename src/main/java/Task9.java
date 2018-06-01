import java.util.ArrayList;

public class Task9{
    /**
     * Task 9 from Senla tasks: написать программу выводящую на экран
     * все четные числа и их сумму из последовательности от 0 до N.
     * N вводится вручную
     * @param n последний элемент последовательности
     */
    public static void evenNumbers(int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
