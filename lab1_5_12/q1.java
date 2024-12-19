import java.util.Scanner;

class q1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine(); // Correct method: nextLine()
        
        System.out.println("Enter your Roll Number");
        int rollno = in.nextInt(); // Read integer input
        
        in.nextLine(); // Consume the leftover newline character
        
        System.out.println("Enter your Section");
        String section = in.nextLine(); // Correct method: nextLine()
        
        System.out.println("Enter your Branch");
        String branch = in.nextLine(); // Correct method: nextLine()
        
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}
