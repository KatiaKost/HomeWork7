import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int computerNumber = (int) Math.random() * 3;
        System.out.println("Введите число 0 - камень, 1 - ножницы, 2 - бумага");
        int userNumber = input.nextInt();
        System.out.println(computerNumber);

        if (userNumber == 0 && computerNumber == 1 || userNumber == 1 && computerNumber == 2 || userNumber == 2 && computerNumber == 0) {
            System.out.println("Вы победили.");
        } else if (userNumber == 0 && computerNumber == 2 || userNumber == 1 && computerNumber == 0 || userNumber == 2 && computerNumber == 1){
            System.out.println("Вы проиграли.");
        } else {
            System.out.println("У вас ничья.");
        }
    }
}