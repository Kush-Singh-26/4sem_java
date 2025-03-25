import java.io.*;
import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary file 1 path:");
        String file1 = sc.nextLine();

        System.out.println("Enter binary file 2 path:");
        String file2 = sc.nextLine();
        sc.close();  
    
        try (BufferedInputStream br1 = new BufferedInputStream(new FileInputStream(file1));
             BufferedInputStream br2 = new BufferedInputStream(new FileInputStream(file2))) {

            int b1, b2;
            int bytepos = 1;

            while (true) {
                b1 = br1.read();
                b2 = br2.read();

                if (b1 == -1 && b2 == -1) {
                    System.out.println("Both files are equal");
                    return;
                }

                if (b1 != b2) {
                    System.out.println("2 files are not equal at position " + bytepos);
                    return;
                }

                bytepos++;
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}