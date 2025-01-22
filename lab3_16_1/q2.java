// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
// two methods to print the area and perimeter of the rectangle respectively.
// Its constructor having parameters for length and breadth is used to initialize length 
// and breadth of the rectangle.


import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;

    void printarea(){
        int area = length * breadth;
        System.out.println("Area = " + area);
    }

    void printperimeter(){
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter = " + perimeter);
    }

}

class q2{
    public static void main(String args[])
    {
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth :");
        rec.length = sc.nextInt();
        rec.breadth = sc.nextInt();
        
        rec.printarea();
        rec.printperimeter();
    }
}