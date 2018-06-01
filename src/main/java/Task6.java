import java.math.BigDecimal;

public class Task6 {

    /**
     * Task 6 from Senla tasks: написать программу,
     * которая проверяет три отрезка на возможность создать
     * прямоугольный треугольник.
     * Длина отрезков вводится вручную.
     * @param side1 первый отрезок
     * @param side2 второй отрезок
     * @param side3 третий отрезок
     * @return возвращает true если можно создать прямоугольный треугольник, в противном случае false
     */
    public static boolean CanBeTriangle(BigDecimal side1, BigDecimal side2, BigDecimal side3){
        return side1.pow(2).add(side2.pow(2)).equals(side3.pow(2));
    }
}
