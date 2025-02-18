import java.util.Scanner;
class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of numerator :");
        int num = sc.nextInt();
        int den = 0;

        try {
            int result = num/den;
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught : Division by 0 not allowed.");
        }
        finally{
            System.out.println("Finaly block executed");
        }
    }
    
}
