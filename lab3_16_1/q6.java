import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculateArea() {
        return length * breadth;
    }

    void display() {
        System.out.println("Area = " + length + "*" + breadth + " = " + calculateArea());
    }
}

class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Using default constructor:");
        defaultRectangle.display();

        System.out.println("\nEnter the length and breadth of the rectangle:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle parameterizedRectangle = new Rectangle(length, breadth);
        System.out.println("Using parameterized constructor:");
        parameterizedRectangle.display();

    }
}
