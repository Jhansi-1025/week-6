
public class Factorial{
    // Recursive function to calculate factorial
    public static long calculate(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * calculate(n - 1); // Recursive call
    }

    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        
            long result = calculate(5);
            System.out.println("Factorial of 5" + " is: " + result);
    }
}