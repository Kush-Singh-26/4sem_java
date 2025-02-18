package q6;
import q6.general.employee;
import q6.marketing.sales;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name:");
        int empid = sc.nextInt();
        sc.nextLine(); 
        String ename = sc.nextLine();

        System.out.println("Enter the basic salary:");
        double basic = sc.nextDouble();

        sales s = new sales(empid, ename, basic);

        double totalEarnings = s.earnings();

        System.out.println("The emp id of the employee is " + s.getEmpId());
        System.out.println("The total earning is " + totalEarnings);
    }
}
