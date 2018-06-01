public class Task10 {
    /**
     * Task 10 from Senla tasks: написать программу, составляющую
     * всевозможные комбинации 3-х значных чисел из 3-х введенных
     * пользователем цифр. Цифры вводятся вручную.
     * @param fDig первая цифра
     * @param secDig вторая цифра
     * @param thDig третья цифра
     * @return возвращает всевозможные комбинации 3-х значных чисел
     */
    public static String Combinations(int fDig,int secDig,int thDig){
        return ""+fDig+secDig+thDig+" "+fDig+thDig+secDig+" "+secDig+thDig+fDig+" "
                +secDig+fDig+thDig+" "+thDig+secDig+fDig+" "+thDig+fDig+secDig;
    }
}
