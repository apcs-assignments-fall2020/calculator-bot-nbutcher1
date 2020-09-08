import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a > b && a > c) {
            if (b > c)
                return b;
            else
                return c;     
        }
        else if (b > a && b > c) {
            if (a > c)
                return a;
            else
                return c;
        }
        else {
            if (b > a)
                return b;
            else
                return a;
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int c = Math.abs(a) - Math.abs(b);
        if (c >= 0) 
            return a;
        else
            return b;

    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt((a*a) + (b*b));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first value");
        int a = scan.nextInt();
        System.out.println("What is your next value?");
        int b = scan.nextInt();
        System.out.println("What is your last value?");
        int c = scan.nextInt();

        System.out.println(median(a, b, c));
        System.out.println(magnitude(a, b)); 
        System.out.println(pythagoras(a, b)); 


    }
}
