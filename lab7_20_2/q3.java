import java.util.Scanner;
import java.io.*;

class q3 {
    static void usingcharstream(String souce, String dest) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(souce));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest))){
            int ch;
            while ((ch = br.read()) != -1){
                bw.write(ch);
            }
        }
    }
    
    static void usingbytestream(String source, String dest) throws IOException{
        try (BufferedInputStream instream = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream outstream = new BufferedOutputStream(new FileOutputStream(dest))){
                byte[] buffer = new byte[1024];
                int byteread;
                while((byteread = instream.read(buffer)) != -1){
                    outstream.write(buffer, 0, byteread); 
                    // 0 is the offset. from where to begin writing 
                }
            }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source file's path");
        String src = sc.nextLine();

        System.out.println("Enter Destination for char stream");
        String destc = sc.nextLine();

        System.out.println("Enter Destination for byte stream");
        String destb = sc.nextLine();

        try{
            usingcharstream(src, destc);
            System.out.println("Copied using character stream");

            usingbytestream(src, destb);
            System.out.println("Copied using byte stream");
        }
        catch(IOException e){
            System.err.println("Error occured" + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
}