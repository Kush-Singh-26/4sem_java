class Subtract{
    int subtract(int a, int b){
        return a-b;
    }

    float subtract(float a, float b){
        return a-b;
    }

    double subtract(double a, double b){
        return a-b;
    }
}

class q4{
    public static void main(String args[]){
        Subtract subt = new Subtract();
        
        System.out.println("Subtract two integers 10-5 = " + subt.subtract(10, 5));

        System.out.println("Subtract two float 10.5 - 3.2 = " + subt.subtract(10.5f, 3.2f));

        System.out.println("Subtract two double 20.3 - 13.5666 =  " + subt.subtract(20.3, 13.5666));

    }
}