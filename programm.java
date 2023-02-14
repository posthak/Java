
// 1. Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// public class programm {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите число: ");
//         int n = scanner.nextInt();
//         scanner.close();
//         int resSum = 0;
//         int resMult = 1;
//         for (int i = 1; i <= n; i++) {
//             resSum = resSum + i;
//             resMult = resMult * i;
//         }
//         System.out.println("сумма чисел: " + resSum + ",произведение чисел: " + resMult);
//     }
// }

// 2. Вывести все простые числа от 1 до 1000
// public class programm {
//     public static void main(String[] args) {
//         boolean st = true;
//         for (int i = 2; i <= 1000; i++) {
//             for (int x = 2; x < i; x++) {
//                 if (i % x == 0) {
//                     st = false;
//                     break;
//                 }
//             }
//             if (st) {
//                 System.out.print(i + " ");
//             } else {
//                 st = true;
//             }
//         }
//     }
// }

// 3. Реализовать простой калькулятор
public class programm {
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

// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут
// быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.
