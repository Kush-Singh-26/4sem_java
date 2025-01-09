import java.util.Scanner;

class q1{
	public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			System.out.print("Enter first number : ");
			int a = in.nextInt();
			System.out.print("Enter second number : ");
			int b = in.nextInt();
			System.out.print("Enter third number : ");
			int c = in.nextInt();
			
			int max = (a > b) ? a : b;
			max = (max > c) ? max : c;
			
			System.out.println("Largest integer is : " + max);
	}
}
			
			