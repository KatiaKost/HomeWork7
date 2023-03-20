import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число. 0 - Орёл, 1 - Решка.");
        int userNumber = input.nextInt();
        int randomNumber = (int) (Math.random() * 2);
        System.out.println(randomNumber);

        if (userNumber == randomNumber) {
            System.out.println("Вы угадали.");
        } else {
            System.out.println("К сожалению вы не угадали(");
        }

    }
}
