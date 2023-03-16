import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите цену: ");
        double payment = input.nextDouble();
        System.out.print("Введите оценку: ");
        int estimation = input.nextInt();

        if (estimation > 90) {
            payment = payment * ((payment * 3) / 100);
            System.out.println("Оплата составляет: " + payment);
        }else {
            payment = payment * (payment / 100);
            System.out.println("Оплата составляет: " + payment);
        }
    }
}
