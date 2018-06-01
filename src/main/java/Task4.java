import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    /**
     * Task 4 from Senla tasks: создать программу, которая будет подсчитывать количество слов
     * в предложении и выводить их в отсортированном виде.
     * Предложение вводится вручную.
     * Разделители пробел (“ ”) и запятая (“,”).
     * @param sentence ваше предложение
     * @return возвращает отсортированный список слов
     */
    public static List<String> sortedString(String sentence){
        return Arrays.stream(sentence.split(",+ *| +")).sorted().collect(Collectors.toList());
    }
}
