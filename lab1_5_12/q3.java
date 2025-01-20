import java.util.Scanner;

class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number : ");
        
        int day = sc.nextInt();
        
        switch(day) {
            case 1:
                System.out.println("Day " + day + " = Sunday");
                break;
            case 2:
                System.out.println("Day " + day + " = Monday");
                break;
            case 3:
                System.out.println("Day " + day + " = Tuesday");
                break;
            case 4:
                System.out.println("Day " + day + " = Wednesday");
                break;
            case 5:
                System.out.println("Day " + day + " = Thursday");
                break;
            case 6:
                System.out.println("Day " + day + " = Friday");
                break;
            case 7:
                System.out.println("Day " + day + " = Saturday");
                break;
            default:
                System.out.println("Incorrect input! Please enter a number between 1 and 7.");
                break;
        }
    }
}
