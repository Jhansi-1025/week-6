import java.util.Scanner;

public class Factorial{
    // Recursive function to calculate factorial
    public static long calculate(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * calculate(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculate(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
        scanner.close();
    }
}