import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

// 1 Реализовать телефонный справочник  HashMap<Login, Список телефонов>
// - добалять телефон
// - удалять телефон
// - находить по логину телефон/список телефонов

public class homeWork4_1 {
    public static void main(String[] args) {
        // Random random = new Random();
        try {
            Map<String, HashSet<String>> phoneDictionary = new HashMap<>();
            while (true) {
                System.out.println("1. Добавить телефон");
                System.out.println("2. Удалить телефон");
                System.out.println("3. Найти телефон по логину");
                System.out.println("4. Выход");
                System.out.println("Введите номер операции: ");
                Scanner scanner = new Scanner(System.in);
                Integer n = scanner.nextInt();
                if (n == 1) {
                    System.out.println(AddPhone(phoneDictionary));
                }
                if (n == 2) {
                    System.out.println(DeletePhone(phoneDictionary));
                }
                if (n == 3) {
                    FindPhone(phoneDictionary);
                }
                if (n == 4) {
                    System.exit(1);
                }
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        }
    }

    public static Map<String, HashSet<String>> AddPhone(Map<String, HashSet<String>> hash) {
        try {
            System.out.print("Введите логин: ");
            Scanner sca = new Scanner(System.in);
            String login = sca.next();
            System.out.print("Введите номер телефона: ");
            Scanner sc = new Scanner(System.in);
            String num = sc.next();
            if (hash.containsKey(login)) {
                hash.get(login).add(num);
            } else {
                HashSet<String> numHs = new HashSet<>();
                numHs.add(num);
                hash.put(login, numHs);
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        }
        return hash;
    }

    public static Map<String, HashSet<String>> DeletePhone(Map<String, HashSet<String>> hash) {
        try {
            System.out.print("Введите номер телефона: ");
            Scanner scs = new Scanner(System.in);
            String number = scs.next();
            for (Map.Entry<String, HashSet<String>> set : hash.entrySet()) {
                if (set.getValue().contains(number)) {
                    Iterator<String> it = set.getValue().iterator();
                    HashSet<String> hs = set.getValue();
                    while (it.hasNext()) {
                        it.next();
                        hs.remove(number);
                    }
                    hash.put(set.getKey(), hs);
                }
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        }
        return hash;
    }

    public static void FindPhone(Map<String, HashSet<String>> hash) {
        try {
            System.out.print("Введите логин: ");
            Scanner scr = new Scanner(System.in);
            String login = scr.next();
            HashSet<String> hs = new HashSet<String>();
            for (Map.Entry<String, HashSet<String>> set : hash.entrySet()) {
                if (set.getKey().contains(login))
                    hs = set.getValue();
            }
            System.out.println(hs);
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        }
    }
}