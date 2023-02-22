import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 2 Пусть дан произвольный список целых чисел, удалить из него четные числа

public class homeWork3_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        System.out.println(deleteOdd(getArrayList(list)));

    }

    public static List<Integer> deleteOdd(List<Integer> a) {
        a.removeIf(x -> x % 2 == 0);
        return a;
    }

    public static List<Integer> getArrayList(List<Integer> a) {
        Random r = new Random();
        for (Integer i = 0; i < 10; i++) {
            a.add(r.nextInt(10));
        }
        System.out.println(a);
        return a;
    }
}