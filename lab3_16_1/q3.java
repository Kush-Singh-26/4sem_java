// Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. 
// Also display the name of the student having lowest cgpa.

import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;
}

class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students n : ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details : ");
            students[i] = new Student();
            System.out.println("Enter roll : ");
            students[i].roll = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name : ");
            students[i].name = sc.nextLine();
            System.out.println("Enter cgpa : ");
            students[i].cgpa = sc.nextFloat();
        }

        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            System.out.println("Roll : " + student.roll + " Name : " + student.name + " CGPA : " + student.cgpa);
        }

        Student lowestCgpaStudent = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = students[i];
            }
        }
        System.out.println("Name of lowest CGPA student : " + lowestCgpaStudent.name);

    }
}