import java.util.Scanner;

public class TreeUse {

    public static TreeNode<Integer> takeInput() {
        int n;
        Scanner s = Scanner(System.in);
        System.out.println("Enter next node data");
        n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = s.nextInt();

        for(int i=0;i<childCount;i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;


    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(4);
        TreeNode<Integer> node1= new TreeNode<Integer>(4);
        TreeNode<Integer> node2 = new TreeNode<Integer>(4);
        TreeNode<Integer> node3= new TreeNode<Integer>(4);
        TreeNode<Integer> node4 = new TreeNode<Integer>(4);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);

        
    }

}