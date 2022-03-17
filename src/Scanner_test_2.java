import java.util.Scanner;

public class Scanner_test_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = a.nextInt(); //считывае первое число и присваиваем значение в number1
        int number2 = a.nextInt(); //считываем второе число и присваиваем значение number2
        System.out.println(number1 + number2); //выводит суму number1 + number2
    }
}
