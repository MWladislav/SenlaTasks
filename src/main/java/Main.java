import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private static void task1(Scanner scan){
        boolean isInputValid;
        long num=0;
        do {
            System.out.println("Введите целое число: ");
            isInputValid = true;

            try {
                num=scan.nextLong();
            }
            catch (NumberFormatException e) {
                System.out.println(String.format("Ошибка! Число должно быть ЦЕЛЫМ и в пределах от %6.3e до %6.3e!",
                        Long.MIN_VALUE * 1.0, Long.MAX_VALUE * 1.0));

                isInputValid = false;
            }
        }while (!isInputValid);

        if (num > 1) {
            System.out.println(Task1.isPrime(num) ? "Число является простым" : "Число является составным");
        }
        else {
            System.out.println((num < 0) ? "отрицательное" : "Число не является ни простым, ни составным");
        }
        System.out.println(Task1.isEven(num) ? "Число является четным" : "Число не является четным");

    }
    private static void task2(Scanner scan){
        System.out.println("Введите целое число: ");
        System.out.println("Input numbers:");
        int a = 0, b = 0;
        try {
            a = Integer.valueOf(scan.next());
            b = Integer.valueOf(scan.next());
            List<Integer> mass = Task2.lcmAndGcd(a, b);
            System.out.println("Sum=" + mass.get(0) + " |" + "dif=" + mass.get(1)
                    + " |" + "LCM=" + mass.get(3) + "| " + "GCD=" + mass.get(2) + " |");
        }
        catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        }
    }
    private static void task3(Scanner scan){
        System.out.println("Input the word:");
        if (Task3.checkPalindrome(scan.nextLine())) System.out.println("Является палиндромом");
        else System.out.println("Не является палиндромом");
    }
    private static void task4(Scanner scan){
        System.out.println("Введите предложение");
        String str=scan.nextLine();
        List<String> list= Task4.sortedString(str);
        list.forEach(System.out::println);
        System.out.println(list.size());
    }
    private static void task5(Scanner scan){
        System.out.println("Введите предложение");
        String str=scan.nextLine();
        System.out.println("Введите слово");
        String word=scan.nextLine();
        System.out.println(Task5.countOfWordUse(str,word));
    }
    private static void task6(Scanner scan){
        int side1;
        int side2;
        int side3;
        do{
            System.out.println("Введите длину первого отрезка");
            side1=scan.nextInt();
            if (side1<=0)
                System.out.println("введенный параметр не является корректным");
        }while (side1<=0);
        do{
            System.out.println("Введите длину второго отрезка");
            side2=scan.nextInt();
            if (side2<=0)
                System.out.println("введенный параметр не является корректным");
        }while (side2<=0);
        do{
            System.out.println("Введите длину третьего отрезка");
            side3=scan.nextInt();
            if (side3<=0)
                System.out.println("введенный параметр не является корректным");
        }while (side3<=0);
        BigDecimal[] sidesArr={new BigDecimal(side1),new BigDecimal(side2),new BigDecimal(side3)};
        Arrays.sort(sidesArr);
        System.out.println(Task6.CanBeTriangle(sidesArr[0], sidesArr[1], sidesArr[2]) ?
                "Возможно создать прямоугольный треугольник" : "Невозможно создать прямоугольный треугольник");


    }
    private static void task7(Scanner scan){
        int n;
        do{
            System.out.println("Введите длину массива");
            n=scan.nextInt();
            if (n<=0)
                System.out.println("введенный параметр не является корректным");
        }while (n<=0);
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(89)+10;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr=Task7.maxAndMinEl(arr);
        System.out.println("Максимальный элемент: "+arr[0]);
        System.out.println("Минимальный элемент: "+arr[1]);
    }
    private static void task8(Scanner scan){
        int n;
        do{
            System.out.println("Введите последний элемент последовательности");
            n=scan.nextInt();
            if (n<=0 || n>=100)
                System.out.println("введенный параметр не является корректным");
        }while (n<=0 || n>=100);
        System.out.println("Числа-палиндромы");
        Task8.palidroms(n).forEach((System.out::println));
    }
    private static void task9(Scanner scan){
        int n;
        do{
            System.out.println("Введите последний элемент последовательности");
            n=scan.nextInt();
            if (n<=0)
                System.out.println("введенный параметр не является корректным");
        }while (n<=0);
        System.out.println("Четные числа");
        Task9.evenNumbers(n);
    }
    private static void task10(Scanner scan){
        int fdig;
        int sdig;
        int tdig;
        do{
            System.out.println("Введите первую цифру");
            fdig=scan.nextInt();
            if (fdig<0 || fdig>9)
                System.out.println("введенный параметр не является корректным");
        }while (fdig<0 || fdig>9);
        do{
            System.out.println("Введите вторую цифру");
            sdig=scan.nextInt();
            if (sdig<0 || sdig>9)
                System.out.println("введенный параметр не является корректным");
        }while (sdig<0 || sdig>9);
        do{
            System.out.println("Введите третью цифру");
            tdig=scan.nextInt();
            if (tdig<0 || tdig>9)
                System.out.println("введенный параметр не является корректным");
        }while (tdig<0 || tdig>9);
        if(fdig==sdig && fdig==tdig)
            System.out.println("в данном случае только одна комбинация: "+fdig + sdig + tdig);
        else System.out.println("Всевозможные комбинации: "+Task10.Combinations(fdig,sdig,tdig));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        int n=scan.nextInt();
        while (true){
            if(n==1){
                task1(scan);
            }
            if(n==2){
                task2(scan);
            }
            if(n==3){
                task3(scan);
            }
            if(n==4){
                task4(scan);
            }
            if(n==5){
                task5(scan);
            }
            if(n==6){
                task6(scan);
            }
            if(n==7){
                task7(scan);
            }
            if(n==8){
                task8(scan);
            }
            if(n==9){
                task9(scan);
            }
            if(n==10){
                task10(scan);
            }
            if(n==0){
                break;
            }
        }

    }
}