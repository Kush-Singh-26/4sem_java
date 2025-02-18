import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}

class q3 {
    public static void checkNumber(int number) throws NegativeNumberException{
        if(number < 0)
            throw new NegativeNumberException("Number should be positive");
        else
            System.out.println("Double value : " + (number * 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        try{
            checkNumber(number);
        }
        catch(NegativeNumberException e){
            System.out.println("Caught the exception");
            System.out.println("Exception occurred : " + e);
        }
    }
}
