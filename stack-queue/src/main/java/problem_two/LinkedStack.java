package problem_two;

public class LinkedStack {

    class Node {
        Object value;
        Node next;
        Node(Object item) {
            value = item;
        }
    }

    Node top;
    Node bottom;
    int count;

    public void  push(Object item) {
        if (item == null) return;
        Node n = new Node(item);
        if (top == null){
            top = bottom = n;
            top.next = null;
        }
        else{
            Node currentTop = top;
            top = n;
            top.next = currentTop;
        }
        count++;
    }

    public Object pop(){
        if(isEmpty()) return null;
        Object value = top.value;
        top = top.next;
        count--;
        return value;
    }

    public Object peek(){
        if (isEmpty()) return null;
        return top.value;
    }

    public boolean isEmpty(){
        return (top==null);
    }

    public int size(){
        if (isEmpty()) return 0;
        return count;
    }
    public  void print(){
        Node n = top;
        System.out.print("Linked S: ");
        if (n == null)
            System.out.println("empty");
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedStack k = new LinkedStack();
        k.print();
        System.out.println("size(): " + k.size());
        k.push(1);
        System.out.println("size(): " + k.size());
        k.push(2);
        k.push(3);
        k.push(4);
        k.print();
        System.out.println("Remove(): " + k.pop());
        k.print();
        System.out.println("peek(): " + k.peek());
        k.push(6);
        k.push(7);
        k.print();
        System.out.println("Remove(): " + k.pop());
        k.print();
        System.out.println("size(): " + k.size());
        System.out.println("isEmpty(): " + k.isEmpty());

    }


}

    