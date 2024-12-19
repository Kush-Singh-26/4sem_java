import java.util.Scanner;

class q2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		int noeven = 0;
		int noodd = 0;
		for(int i = 0;i<10;i++)
		{
			int temp = in.nextInt();
			if(temp%2 == 0)
				noeven++;
			else
				noodd++;
		}
		
		System.out.println("Number of even numbers = " + noeven);
		System.out.println("Number of odd numbers = " + noodd);
	}
}