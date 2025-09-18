public class PalindromeChecker {
    static class Palindrome {
        String text;

        Palindrome(String text) {
            this.text = text;
        }

        boolean isPalindrome() {
            String reversed = new StringBuilder(text).reverse().toString();
            return text.equals(reversed);
        }

        void display() {
            if (isPalindrome()) {
                System.out.println(text + " is a palindrome.");
            } else {
                System.out.println(text + " is not a palindrome.");
            }
        }
    }

    public static void main(String[] args) {
        Palindrome checker = new Palindrome("madam");
        checker.display();
    }
}