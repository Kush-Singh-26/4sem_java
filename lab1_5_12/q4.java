import java.util.Scanner;

class q4{
	public static void main(String args[]){
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter number");
		int num = myobj.nextInt();
		int temp, sum = 0, r;
		temp = num;
		while(temp>0)
		{
			r = temp%10;
			sum = sum*10 +r;
			temp = temp/10;
		}
		
		if(num == sum){
			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}