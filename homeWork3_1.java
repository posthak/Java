import java.util.ArrayList;
import java.util.Random;

// 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
// 2 Пусть дан произвольный список целых чисел, удалить из него четные числа

public class homeWork3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        printValues(getArrayList(list));

    }

    public static void printValues(ArrayList<Integer> a) {
        Integer max = a.get(0);
        Integer min = a.get(0);
        Double avg = 0.0;
        for (Integer i = 0; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
            if (a.get(i) < min) {
                min = a.get(i);
            }
            avg += a.get(i);
        }
        System.out.printf("MIN:" + min + "%nMAX:" + max + "%nAVG:" + avg / a.size());
    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> a) {
        Random r = new Random();
        for (Integer i = 0; i < 10; i++) {
            a.add(r.nextInt(10));
        }
        System.out.println(a);
        return a;
    }
}