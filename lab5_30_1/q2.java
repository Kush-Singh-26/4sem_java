interface Motor {
    final int capacity = 20;
    void run();
    void consume();    
}

class WashingMachine implements Motor{
    public void run(){
        System.out.println("Washing machine running");
    }

    public void consume(){
        System.out.println("Washing machine is consuming electricity");
    }

    void display(){
        System.out.println("Capacity of the motor is : " + capacity);
    }
}
class q2{
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.display();
    }
}