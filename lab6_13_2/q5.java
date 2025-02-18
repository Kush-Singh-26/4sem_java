class CheckArgument extends Exception{
    public CheckArgument(String message){
        super(message);
    }
}
class q5 {
    public static void main(String[] args) {
        try{
            if(args.length < 4)
                throw new CheckArgument("Check Arguments. It must be greater than 4");

            int sum = 0;
            for(int i = 0;i < 4; i++)
            {
                int temp = Integer.parseInt(args[i]);
                sum += temp * temp;
            }
            System.out.println(sum);
        }
        catch(CheckArgument e){
            System.out.println("Exception occurred- " + e.getMessage());
        }
    }
}
