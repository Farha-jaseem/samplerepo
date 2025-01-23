package Assignment_this_reverse;


public class Factorial {

    private int number; // Instance variable

    // Constructor to initialize the number
    public Factorial(int number) {
        this.number = number; // Using 'this' to refer to the instance variable
    }

    // Method to calculate factorial
    public int calculateFactorial() {
        int factorial = 1;
        for (int i = 1; i <= this.number; i++) 
        { // Using 'this' to refer to the instance variable
            factorial *= i;
        }
        return factorial;
    }

    // Method to print the result
    public void printResult() {
        int result = this.calculateFactorial(); // Using 'this' to call the calculateFactorial method
        System.out.println("The factorial of " + this.number + " is: " + result);
    }

    public static void main(String[] args) {
        // Create an object and call only the printResult method
        Factorial obj = new Factorial(5); // Pass the number as an argument
        obj.printResult();
    }
}
