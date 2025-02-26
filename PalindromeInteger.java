//A simple Java program to check whether a given integer is a palindrome.
//It reverses the number and compares it with the original to determine if they are the same.

public class PalindromeInteger {

        public int isPalindrome(int A) {
            if( (A > Integer.MAX_VALUE) || (A < Integer.MIN_VALUE)){
                return 0;
            }

            int original = A;
            int reversed = 0;

            while (A > 0) {
                int digit = A % 10;
                reversed = reversed * 10 + digit;
                A /= 10;
            }

            return (original == reversed)?1:0;

        }
    }


