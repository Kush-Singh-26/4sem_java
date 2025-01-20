import java.util.Scanner;

class q1{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter three number : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int maxi = (a > b) ? a : b;
			maxi = (maxi > c) ? maxi : c;
			
			System.out.println("Largest number is : " + maxi);
	}
}
			
			