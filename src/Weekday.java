import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int weekNumber = input.nextInt();

        switch (weekNumber) {
            case 0 -> System.out.println("Понедельник");
            case 1 -> System.out.println("Вторник");
            case 2 -> System.out.println("Среда");
            case 3 -> System.out.println("Четверг");
            case 4 -> System.out.println("Пятница");
            case 5 -> System.out.println("Суббота");
            case 6 -> System.out.println("Воскресенье");
            default -> System.out.println("Такого дня недели не существует");
        }
    }
}
