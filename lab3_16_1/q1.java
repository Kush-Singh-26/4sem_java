import java.util.Scanner;
class Box{
	int length;
	int width;
	int height;
	
	void volume()
    {
        System.out.println("Volume = " + length*width*height);
    }
}

class q1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Box demo =  new Box();
        System.out.println("Enter length, width and height of a box");
        demo.length = sc.nextInt();
        demo.width  = sc.nextInt();
        demo.height = sc.nextInt();
        
        demo.volume();
    }
}

