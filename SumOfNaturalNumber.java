package JAVA;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 10; // Number up to which we want the sum
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
