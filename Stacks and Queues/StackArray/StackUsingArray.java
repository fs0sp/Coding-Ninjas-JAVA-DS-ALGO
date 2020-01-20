

public class StackUsingArray {


    private int data[];
    private int top; // index of topmost element of stack 

    public StackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public StackUsingArray(int capacity) {
        data = new int[capacity];
    }

    public boolean isEmpty() {
        return (top == -1); // -1 means stack is empty
    }

    public int size() {
        return top+1;
    }

    public int top() throws StackEmptyException {

        if(size() == 0) {
            StackEmptyException e  = new StackEmptyException();
            throw e;
        }

        return data[top];
    }

    public void push(int element) throws StackFullException {

        if(size() == data.length) {
            StackFullException e  = new StackFullException();
            throw e;
        }

        top++;
        data[top] = element;
    }

    public int pop() throws StackEmptyException {

        if(size() == 0) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }

        int temp = data[top];
        top--;
        return temp;
    }


}