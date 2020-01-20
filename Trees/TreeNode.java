import java.util.ArrayList;

public class TreeNode<T> {
   public T data;
   public ArrayList<TreeNode<T>> children;

   public class TreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
   }
}