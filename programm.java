
// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        scanner.close();
        int resSum = 0;
        int resMult = 1;
        for (int i = 1; i <= n; i++) {
            resSum = resSum + i;
            resMult = resMult * i;
        }
        System.out.println("сумма чисел: " + resSum + ",произведение чисел: " + resMult);
    }
}