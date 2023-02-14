// 2. Вывести все простые числа от 1 до 1000
public class homeWork1_2 {
    public static void main(String[] args) {
        boolean st = true;
        for (int i = 2; i <= 1000; i++) {
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    st = false;
                    break;
                }
            }
            if (st) {
                System.out.print(i + " ");
            } else {
                st = true;
            }
        }
    }
}
