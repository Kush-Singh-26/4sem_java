import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

class Twodimension {
    int length;
    int bredth;
    int cost2d = 40;

    Twodimension(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    int area() {
        return (length * bredth);
    }

    int calculateCost() {
        return area() * cost2d;
    }
}

class ThreeDimension extends Twodimension {
    int height;
    int cost3d = 60;

    ThreeDimension(int length, int bredth, int height) {
        super(length, bredth);
        this.height = height;
    }

    int volume() {
        return (length * bredth * height);
    }

    int calculateCost() {
        return volume() * cost3d;
    }

}

class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 for 2D and 3 for 3D");
        int choice = sc.nextInt();

        if (choice == 2) {
            System.out.println("Enter length and breadth : ");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Twodimension twodim = new Twodimension(length, breadth);
            System.out.println("Cost = " + twodim.calculateCost());
        } else if (choice == 3) {
            System.out.println("Enter length, breadth and height : ");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            int height = sc.nextInt();
            ThreeDimension threedim = new ThreeDimension(length, breadth, height);
            System.out.println("Cost = " + threedim.calculateCost());
        }

        else {
            System.out.println("Incorrect choice");
        }
    }

}