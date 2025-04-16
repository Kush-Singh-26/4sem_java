interface Vehicle{
    void speed();
}

class Car implements Vehicle{
    public void speed(){
        System.out.println("Max speed of car is 150 kmph");
    }
}

class Bike implements Vehicle{
    public void speed(){
        System.out.println("Max speed of bike is 100 kmph");
    }
}

class q2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.speed();
        bike.speed();
    }    
}