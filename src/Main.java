import java.util.Scanner;

// Найти сумму квадратов всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b >= a).
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int tranz = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число, оно должно быть больше или равно первому");
        int b =scanner.nextInt();

        if (a <= b) {
            for (int i = a; i < b+1; i++) {
                sum += i*i;
            }
            System.out.println("сумму квадратов всех целых чисел от a до b: " + sum);
        } else if (a > b) {
            System.out.println("Ты ввел неправильно второе число, внимательно прочитай что от тебя требуется и повтори попытку");
        }
    }
}