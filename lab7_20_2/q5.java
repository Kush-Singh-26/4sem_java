import java.io.*;
import java.util.Scanner;
class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String file = sc.nextLine();
        sc.close();

        int countchar=0, countline=0, countwords=0;

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            
            while((line = br.readLine()) != null){
                countline++;
                countchar += line.length();
                countwords += line.split("\\s+").length;
            }
            System.out.println("No. of characters: " + countchar);
            System.out.println("No. of lines: " + countline);
            System.out.println("No. of words: " + countwords);    

        }
        catch(IOException e){
            System.out.println("Error occurred" + e.getMessage());
        }
    }
}