import java.util.Scanner;
class Plate {
    int length;
    int width;

    Plate(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void displayDimension() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    @Override
    void displayDimension() {
        super.displayDimension(); 
        System.out.println("Height = " + height);
    }
}

class Wood_box extends Box {
    int thick;

    Wood_box(int length, int width, int height, int thick) {
        super(length, width, height);
        this.thick = thick;
    }

    @Override
    void displayDimension() {
        super.displayDimension(); 
        System.out.println("Thick = " + thick);
    }
}

class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, height, thick:");
        Wood_box woodbox = new Wood_box(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        woodbox.displayDimension();
    }
}
