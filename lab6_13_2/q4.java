import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    int hours;
    int minutes;
    int seconds;

    void inputmethod(int hours, int minutes, int seconds) {
        boolean hasError = false;
        
        if (hours > 24 || hours < 0) {
            System.out.println("Exception occurred: InvalidHourException:hour is not greater than 24");
            hasError = true;
        }
        if (minutes > 60 || minutes < 0) {
            System.out.println("Exception occurred: InvalidMinuteException:minute is not greater than 60");
            hasError = true;
        }
        if (seconds > 60 || seconds < 0) {
            System.out.println("Exception occurred: InvalidSecondException:second is not greater than 60");
            hasError = true;
        }

        if (!hasError) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
        }
    }
}

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        Time time = new Time();
        time.inputmethod(hours, minutes, seconds);
    }
}