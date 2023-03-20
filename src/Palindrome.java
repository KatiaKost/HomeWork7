import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое трёхзначное число:");
        int number = input.nextInt();
        int firstDigit = number / 100;
        int thirdDigit = number % 10;

        String message = (firstDigit == thirdDigit) ? "палиндром" : "не палиндром";
        System.out.print(message);
    }
}
