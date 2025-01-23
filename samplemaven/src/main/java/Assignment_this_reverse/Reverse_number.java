package Assignment_this_reverse;

public class Reverse_number {
	 private int number; // Instance variable
	    
	    // Constructor to calculate reverse
	    public Reverse_number(int number) {
	        this.number = number; // Assigning argument to instance variable
	    }

	    // Constructor to display the message
	    public Reverse_number() {
	        System.out.println("Finding reverse...");
	    }

	    // Method to calculate reverse
	    public int calculateReverse() {
	        int reverse = 0;
	        int temp = number;
	        while (temp != 0) {
	            int digit = temp % 10;
	            reverse = reverse * 10 + digit;
	            temp /= 10;
	        }
	        return reverse;
	    }

	
   

    public static void main(String[] args) {
        // Invoking the display constructor
        new Reverse_number();
        
        // Invoking the constructor for calculation
        Reverse_number reverseNumber = new Reverse_number(12345);
        int reverse = reverseNumber.calculateReverse();
        System.out.println("Reverse of the number: " + reverse);
    }
}
