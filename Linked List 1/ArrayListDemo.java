import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[])  {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(30)
;        // for(int i=0;i<10;i++) {
        //     list1.add(i);
        // }
        list1.set(2, 20);
       // list1.get(4);   // INDEX OUT OF BOUND EXCEPTION

        // for(int i=0;i<list1.size();i++) {
        //     System.out.println(list1.get(i) + " " );
        // }

        for(int elem : list1) {
            System.out.print(elem+ " ");
        }

        System.out.println(list1.size());
    }

}