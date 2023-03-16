import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое трёхзначное число:");
        int number = input.nextInt();
        int firstDigit = number / 100;
        int thirdDigit = number % 10;

        if (firstDigit == thirdDigit){
            System.out.println("Это число-палиндром");
        }else {
            System.out.println("Это не число-палиндром");
        }



    }
}
