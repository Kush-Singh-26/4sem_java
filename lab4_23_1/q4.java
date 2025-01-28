import java.util.Scanner;

class Account{
    int acc_no;
    double balance;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter Account Number : ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance : ");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    void disp(){
        System.out.println("Account Number : " + acc_no);
        System.out.println("Balance : " + balance);
    }
    
}

class Person extends Account{
    String name;
    int aadhar_no;
    Scanner sc = new Scanner(System.in);

    void input(){
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = sc.nextInt();
    }

    void disp(){
        super.disp();
        System.out.println("Name : " + name);
        System.out.println("Addhar No. : " +aadhar_no);
    }

}

class q4 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        System.out.println("Enter details of 3 people : ");
        for(int i =0;i<3;i++)
        {
            System.out.println("Enter detail of person " + (i+1) + " :");
            person[i] = new Person();
            person[i].input();
        }

        System.out.println("Details of 3 people : ");
        for(int i =0;i<3;i++){
            System.out.println("Person " + (i+1) + " :");
            person[i].disp();
        }
    }    
}
