public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Program starts

        // Hardcoded string
        String text = "madam";

        // Reverse the string
        String reversed = new StringBuilder(text).reverse().toString();

        // Check if palindrome
        if (text.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Program exits
    }
}