import java.util.Scanner;

class Area{
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    double area(int side) {
        return side * side;
    }
}

class q5{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Area ar = new Area();

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of the circle: " + ar.area(radius));
                break;

            case 2: 
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of the triangle: " + ar.area(base, height));
                break;

            case 3: 
                System.out.print("Enter the side of the square: ");
                int side = sc.nextInt();
                System.out.println("Area of the square: " + ar.area(side));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}