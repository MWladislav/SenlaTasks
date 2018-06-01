public class Task1 {
    /**
     * Task 1 from Senla tasks: создать программу, которая будет сообщать,
     * является ли целое число, введенное пользователем, простым или составным
     * @param val целое положительное число
     * @return возвращает true если число простое и false если оно составное
     */
    public static boolean isPrime(long val) {
        for (int i = 2; i < Math.sqrt(val); i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод который определяет, является ли число четным
     * @param val целое число
     * @return возвращает true если число четное и false в противном случае
     */
    public static boolean isEven(long val) {
        return val % 2 == 0;
    }
}
