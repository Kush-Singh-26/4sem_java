import java.util.Scanner;

class q5{
	public static void main(String args[]){
		System.out.println("Enter the number of numbers " );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int maxint = Integer.MIN_VALUE;
		System.out.println("Enter " + n + " numbers :");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			maxint = Math.max(maxint, arr[i]);
		}
		
		int[] frequencyArr = new int[maxint + 1];		

		for (int num : arr) {
            frequencyArr[num]++; 
        }
		
		System.out.println("Occurrences:");
        for (int i = 0; i <= maxint; i++) {
            if (frequencyArr[i] > 0) { 
                System.out.println("Occurrence of " + i + "=" + frequencyArr[i]);
            }
        }
	}
}