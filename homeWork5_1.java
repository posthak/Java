import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Учитывая два целочисленных массива nums1 и nums2, верните максимальную длину подмассива, который появляется в обоих массивах.
// Example 1:
// Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
// Output: 3
// Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].
// Example 2:
// Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
// Output: 5
// Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0].

public class homeWork5_1 {
    public static void main(String[] args) {
        int[] num1 = { 3, 0, 4, 7, 9 };
        int[] num2 = { 1, 4, 7, 9, 0 };
        ArrayList<Integer> ar = getMaxList(separateBySubArray(num1, num2));
        System.out.println("Input: num1 = " + Arrays.toString(num1) + ", num2 = " + Arrays.toString(num2));
        System.out.println("Output: " + ar.size());
        System.out.println("Explanation: Повторяющийся подмассив с максимальной длиной равен " + ar);
    }

    public static HashMap<Integer, ArrayList<Integer>> separateBySubArray(int[] num1, int[] num2) {
        HashMap<Integer, ArrayList<Integer>> hash = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> hs = new ArrayList<>();

        for (int i = 0; i < num1.length; i++) {
            for (int x = 0; x < num2.length; x++) {
                if (num1[i] == num2[x]) {
                    hs = getSubList(i, x, num1, num2);
                    break;
                }
            }
            hash.put(i, hs);
        }
        return hash;
    }

    public static ArrayList<Integer> getSubList(int stIndex1, int stIndex2, int[] n1, int[] n2) {
        ArrayList<Integer> set = new ArrayList<>();
        while (stIndex1 < n1.length && stIndex2 < n2.length) {
            if (n1[stIndex1] == n2[stIndex2]) {
                set.add(n1[stIndex1]);
                stIndex1++;
                stIndex2++;
            } else {
                return set;
            }
        }
        return set;
    }

    public static ArrayList<Integer> getMaxList(HashMap<Integer, ArrayList<Integer>> hash) {
        ArrayList<Integer> set = new ArrayList<>();
        Integer max = hash.get(0).size();
        set = hash.get(0);
        for (Integer x = 0; x < hash.size(); x++) {
            if (max < hash.get(x).size()) {
                max = hash.get(x).size();
                set = hash.get(x);

            }
        }
        return set;
    }
}
