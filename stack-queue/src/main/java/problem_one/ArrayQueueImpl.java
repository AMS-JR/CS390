package problem_one;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
//      if(isEmpty()) throw new IllegalStateException("Queue is empty");
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public void enqueue(int obj){
        //implement
        if(rear == arr.length){
            resize();
        }
        if (front == -1){
            // queue is empty; insert first item
            front = 0;
        }
        arr[rear] = obj;
        rear++;  //cc
    }
    public int dequeue() {
        //implement
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = arr[front];
        front++;  //cc
        // Reset front and rear when the queue becomes empty
        if (front == rear) {
            front = -1; // Adjust front pointer
            rear = 0;  // Reset rear pointer
        }
        return temp;
    }
    public boolean isEmpty(){
        //implement
        return front == -1;
    }
    public int size(){
        //implement
        // what if queue is empty
        if(isEmpty()){
            return 0;
        }
        return rear - front;
    }
    private void resize(){
        //implement
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, front, newArr, 0, size());
        rear -= front; // Adjust rear pointer
        front = 0;  // Reset front pointer
        arr = newArr;
    }
}
