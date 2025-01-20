import java.util.Scanner;
class q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[3][3];
		System.out.println("Enter elements of 3*3 matrix : ");
		for(int i =0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int left = 0, right = 0;
		for(int i =0;i<3;i++)
		{
			left += arr[i][i];
		}
		for(int i =0;i<3;i++)
		{
			right += arr[i][2-i];
		}
		System.out.println("Left = " +left);
		System.out.println("Right = "+right);
	}
}