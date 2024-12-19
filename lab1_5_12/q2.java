import java.util.Scanner;

class q2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Mark");
        
        int mark = in.nextInt();
        
        if (mark >= 90) {
            System.out.println("Mark: " + mark + " = O");
        } else if (mark >= 80) {
            System.out.println("Mark: " + mark + " = E");
        } else if (mark >= 70) {
            System.out.println("Mark: " + mark + " = A");
        } else if (mark >= 60) {
            System.out.println("Mark: " + mark + " = B");
        } else if (mark >= 50) {
            System.out.println("Mark: " + mark + " = C");
        } else if (mark >= 40) {
            System.out.println("Mark: " + mark + " = D");
        } else {
            System.out.println("Mark: " + mark + " = F");
        }
    }
}
