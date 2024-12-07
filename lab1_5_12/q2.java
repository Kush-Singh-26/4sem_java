import java.util.Scanner;
class q2 {
	public static void main(String args[]) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter Grade");
		
		int grade = myobj.nextInt();
		if(grade == 10){
			System.out.println("0");
		}
		else if(grade == 9){
			System.out.println("E");
		}
		else if(grade == 8){
			System.out.println("A");
		}
		else if(grade == 7){
			System.out.println("B");
		}
		else if(grade == 6){
			System.out.println("C");
		}
		else{
			System.out.println("F");
		}
		
	}
}