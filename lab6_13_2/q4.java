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

    void inputmethod(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours > 24 || hours < 0) {
            throw new HrsException("InvalidHourException: hour should be between 0 and 24");
        }
        if (minutes > 60 || minutes < 0) {
            throw new MinException("InvalidMinuteException: minute should be between 0 and 60");
        }
        if (seconds > 60 || seconds < 0) {
            throw new SecException("InvalidSecondException: second should be between 0 and 60");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
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

        try {
            time.inputmethod(hours, minutes, seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}