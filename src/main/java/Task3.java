public class Task3 {
    /**
     * Данный метод проверяет, являестся ли словов палиндромом
     * @param str ваше слово
     * @return возвращает true если слово является палиндромом и false в противном случае
     */
    static boolean checkPalindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        if (str.equals(s.reverse().toString())) {
            return true;
        }
        return false;
    }
}
