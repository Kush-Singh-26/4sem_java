import java.util.Scanner;

class Apple{
    void show(){
        System.out.println("This is an apple");
    }
}

class Banana extends Apple{
    void show(){
        System.out.println("This is a banana");
    }
}

class Cherry extends Apple{
    void show(){
        System.out.println("This is a cherry");
    }
}

class q3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        apple.show();
        banana.show();
        cherry.show();
    }
}
