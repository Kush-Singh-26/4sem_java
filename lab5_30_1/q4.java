import java.util.Scanner;

interface Employee {
    void getDetails(int empId, String eName);
}

interface Manager extends Employee {
    void getDeptDetails(int deptId, String deptName);
}

class Head implements Manager {
    int empId;
    String eName;
    int deptId;
    String deptName;

    public void getDetails(int empId, String eName) {
        this.empId = empId;
        this.eName = eName;
    }

    public void getDeptDetails(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void displayAllDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + eName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

public class q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee id - ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name - ");
        String eName = sc.nextLine();

        System.out.print("Enter department id - ");
        int deptId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department name - ");
        String deptName = sc.nextLine();

        Head head = new Head();
        head.getDetails(empId, eName);
        head.getDeptDetails(deptId, deptName);

        System.out.println("\nOutput:");
        head.displayAllDetails();

    }
}
