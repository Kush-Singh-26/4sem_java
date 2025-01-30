import java.util.Scanner;

abstract class student{
    Scanner sc = new Scanner(System.in);
    int roll_no;
    int reg_no;
    void getinput(){
        System.out.println("Enter Roll No. and Registration No.");
        roll_no = sc.nextInt();
        reg_no = sc.nextInt();
    }
    abstract void course();
}

class Kiitian extends student{
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
    void display(){
        System.out.println("RollNo - " + roll_no);
        System.out.println("Registration no - " + reg_no);
        course();
    }
}

class q1{
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();
        kiitian.getinput();
        kiitian.display();
    }
}