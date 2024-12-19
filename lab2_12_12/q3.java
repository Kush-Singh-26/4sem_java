import java.util.Scanner;

class q3{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no. of numbers :");
		int n = in.nextInt();
		int [] arr = new int[n];
		System.out.printf("Enter %d numbers : ", n);
		for(int i = 0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		for(int i = 0;i<n-1;i++)
		{
			for(int j = 0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}