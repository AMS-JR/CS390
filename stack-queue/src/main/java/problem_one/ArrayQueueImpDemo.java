package problem_one;

public class ArrayQueueImpDemo {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        //check if isempty
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
        //enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Peek: " + queue.peek());

        queue.dequeue();

        System.out.println("Peek after dequeue: " + queue.peek());
        System.out.println("Queue size after dequeue: " + queue.size());
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Peek after enqueue 40 and 50: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Peek after dequeue 2 more times: " + queue.peek());

        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

    }
}
