package JAVA;

public class Factorial {
    public static void main(String[] args) {
        // Directly assign the number
        int num = 5; // You can change this value to test with other numbers

        // Calculate factorial using iterative approach
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
