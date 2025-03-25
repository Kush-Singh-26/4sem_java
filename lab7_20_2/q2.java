import java.io.*;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter student roll no.");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter student name");
            String name = sc.nextLine();

            System.out.println("Enter Subject");
            String subject = sc.nextLine();

            System.out.println("Enter marks");
            double marks = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter file path where the content will be written");
            String filepath = sc.nextLine();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, false))) {
                bw.write(roll + ", " + name + ", " + subject + ", " + marks);
                bw.newLine();
                System.out.println("Student details successfully written to the file.");
            }

            try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }

        catch (IOException e) {
            System.out.println("Error occurred" + e.getMessage());
        }

        finally{
            sc.close();
        }
    }
}