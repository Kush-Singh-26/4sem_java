class OverFlowException extends Exception{
    public OverFlowException(String message){
        super(message);
    }
}

class UnderFlowException extends Exception{
    public UnderFlowException(String messsage){
        super(messsage);
    }
}

class QueueArray{
    int MAX_SIZE;
    int[] arr;
    int front;
    int rear;
    int count; 

    public QueueArray(int capacity){
        this.MAX_SIZE = capacity;
        arr = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isFull(){
        return count == MAX_SIZE;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int size(){
        return count;
    }

    public void enqueue(int data) throws OverFlowException{
        if(isFull()){
            throw new OverFlowException("Queue overflow. Can't enter more elements");
        }
        rear = (rear + 1) % MAX_SIZE;
        arr[rear] = data;
        count++;
    }

    public int dequeue() throws UnderFlowException{
        if(isEmpty()){
            throw new UnderFlowException("Queue underflow. Can't remove any element");
        }
        int removedElement = arr[front];
        front = (front + 1) % MAX_SIZE;
        count--;
        return removedElement;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(arr[i] + " ");
            i = (i + 1) % MAX_SIZE;
        } while (i != (rear + 1) % MAX_SIZE);
        System.out.println();
    }
}

public class QueueArrayDemo {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        try{
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            q.display();

            System.out.println(q.dequeue());

            q.display();
        }catch(OverFlowException | UnderFlowException e){
            System.out.println(e.getMessage());
        }
    }
}
