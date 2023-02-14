import java.util.Scanner;

public class homeWork1_3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            Integer n = scanner.nextInt();

            System.out.print("Введите операцию: ");
            String s = scanner.next();

            System.out.print("Введите второе число: ");
            Integer m = scanner.nextInt();
            var res = 0;
            if (s.contains("*")) {
                res = n * m;
            } else if (s.contains("/")) {
                if (m != 0) {
                    res = n / m;
                } else {
                    System.out.print("На ноль делить нельзя!");
                    System.exit(1);
                }
            } else if (s.contains("+")) {
                res = n + m;
            } else if (s.contains("-")) {
                res = n - m;
            } else {
                System.out.print("Некорректный ввод операции");
                System.exit(1);
            }
            System.out.print("Результат: " + res);
            scanner.close();
        } catch (Exception e) {
            System.out.print("Некорректный ввод");
        }
    }
}
