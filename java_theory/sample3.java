import java.util.Scanner;

class sample3{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Gender :");		
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter age :");				
		int age = sc.nextInt();
		
		System.out.println("Name :" + name);
		System.out.println("Gender : " + gender);
		System.out.println("Age :" + age);
	}
}


