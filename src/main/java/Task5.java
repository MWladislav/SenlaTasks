import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    /**
     * Task 5 from Senla tasks: создать программу,
     * которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
     * Текст и слово вводится вручную.
     * @param text ваш текст
     * @param word слово, для которого подсчитывается кол-во повторений
     * @return возвращает количество употреблений слова word в тексте
     */
    public static int countOfWordUse(String text,String word){
        int count=0;
        Pattern pattern=Pattern.compile(word);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
