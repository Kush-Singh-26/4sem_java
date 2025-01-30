import java.util.Scanner;
interface Office{
    double earnings();
    double deductions();
    double bonus();
}

class Manager implements Office{

    double basic;
    public double earnings(){
        double DA = 0.80 * basic; 
        double HRA = 0.15 * basic; 
        return basic + DA + HRA;
    }

    public double deductions(){
        return 0.12 * basic;
    }

    public double bonus(){
        return 0;
    }
}

class Substaff extends Manager{
    Substaff(double basic){
        this.basic = basic;
    }
    public double bonus(){
        return 0.5 * basic;
    }
}

class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basic = sc.nextDouble();
        Substaff ss =new Substaff(basic);
        double earnings = ss.earnings();
        double deductions = ss.deductions();
        double bonus = ss.bonus();

        System.out.println("Earnings - " + earnings);
        System.out.println("Deductions - " + deductions);
        System.out.println("Bonus - " + bonus);
    }    
}
