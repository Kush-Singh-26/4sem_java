class OverFlowException extends Exception {
    public OverFlowException(String message) {
        super(message);
    }
}

class UnderFlowException extends Exception {
    public UnderFlowException(String message) {
        super(message);
    }
}

class StackArray {
    int MAX_SIZE;
    int[] arr;
    int top;

    public StackArray(int capacity) {
        this.MAX_SIZE = capacity;
        arr = new int[MAX_SIZE];
        top = -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void push(int data) throws OverFlowException {
        if (isFull()) {
            throw new OverFlowException("Stack overflow. Can't push more elements");
        }
        arr[++top] = data;
    }

    public int pop() throws UnderFlowException {
        if (isEmpty()) {
            throw new UnderFlowException("Stack underflow. Can't pop any element");
        }
        return arr[top--];
    }

    public int peek() throws UnderFlowException {
        if (isEmpty()) {
            throw new UnderFlowException("Stack is empty. Nothing to peek");
        }
        return arr[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackArrayDemo {
    public static void main(String[] args) {
        StackArray st = new StackArray(5);
        try{
            st.push(10);
            st.push(20);
            st.push(30);

            st.display();

            System.out.println(st.pop());

            System.out.println(st.peek());
        } catch(OverFlowException | UnderFlowException e){
            System.out.println(e.getMessage());
        }               
    }
}
