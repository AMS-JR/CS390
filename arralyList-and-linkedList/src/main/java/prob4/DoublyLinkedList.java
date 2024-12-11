package prob4;
public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node(null);
    }
    //1. adds to the end of the list
    public void addLast(String item) {
        Node newNode = new Node(item);
        if (header == null) {
            header = newNode;
            return;
        }
        Node last = header;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.previous = last;
    }

    // 2. Remove by passing object
    public boolean remove(String item){
        if (item == null) return false;
        Node tempNode = header.next;
        while (tempNode != null) {
            if (tempNode.value.equals(item)) {
                tempNode.previous.next = tempNode.next;
                if (tempNode.next != null) {
                    tempNode.next.previous = tempNode.previous;
                }
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        if (header.next == null) return false;

        Node tempNode = header.next;
        if (tempNode.next != null) {
            header.next = tempNode.next;
            tempNode.next.previous = header;
        }else {
            header.next = null;
        }
        return true;
    }

    // 4. Prints the list from last to first
    public void printReverse() {
        // Implement
        printReverseHelper(header.next);
    }

    //version 2: recursive
    private static void printReverseHelper(Node node){
        if (node == null) return;
        printReverseHelper(node.next);
        System.out.print(node.value + " ");
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;
        public Node(String value){
            this.value = value;
        }
        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        // Call all your implemented Methods

        list.addLast("Leo");
        list.addLast("Messi");
        System.out.println("Added Leo and Messi "+ list);
        list.removeFirst();
        System.out.println("Removed First Node: " + list);
        list.remove("Steve");
        System.out.println("Removed Steve: " + list);
        System.out.println("Before Reverse: " + list);
        System.out.print("After Reverse: ");
        list.printReverse();
    }
}

