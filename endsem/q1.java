import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            int dividefrom5 = 5/n;
            System.out.println("Quotient is : " + dividefrom5);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by 0 " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }    
}