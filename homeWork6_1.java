import java.util.ArrayList;
import java.util.List;

// Учитывая двоичного дерева,верните порядок обхода значений его узлов.пример 
// Input:root=[1,null,2,3]
// Output:[1,2,3]

public class homeWork6_1 {
    public static void main(String[] args) {

        TreeNode tNode = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                null,
                                new TreeNode(4))));
        System.out.println(preorderTraversal(tNode));

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }

}
