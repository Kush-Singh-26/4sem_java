class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    boolean isEmpty(){
        return rear == null;
    }
    
    public void enqueue(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if(front == null){
            System.out.println("Empty Queue");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if(front == null)
            rear = null;

        return value;
    }

    public void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class QueueDemo{
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}