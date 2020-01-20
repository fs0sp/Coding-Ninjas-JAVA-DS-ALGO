import java.util.Scanner;

public class LinkedListUse {


    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while(data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
               
                    tail.next = newNode;
                    tail = newNode;

            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {

        Node<Integer> temp = head;

        while(head != null) {
            System.out.print(head.data + " ");
            head =  head.next;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {

        Node<Integer> newNode = new Node<Integer>(data);
        
        if(pos == 0) {
            newNode.next = head;
            return newNode;
        }

        int i = 0;
        Node<Integer> temp = head;

        while(i < pos-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }

    public static Node<Integer> delete(Node<Integer> head, int pos) {

        Node<Integer> temp = head;
        int i = 0;

        while(i<pos-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;

    }

    public static void main(String args[]) {

        
        Node<Integer> head = takeInput();
        //head = insert(head, 80, 0);
       // head = delete(head, 2);
        print(head);

        Node<Integer> temp = head;

        System.out.println(temp.next.data);

    }

}