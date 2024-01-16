
public class ReverseDigits {
    public static void main(String[] args) {
        // Initialize a number to some integer value
      int number = 125643;

      // Reverse the digits
      int reversedNumber = reverseDigits(number);

       // Display the original and reversed numbers
       System.out.println("Original Number: " + number);
       System.out.println("Reversed Number: " + reversedNumber);
    }

    // Method to reverse the digits of a number
    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

