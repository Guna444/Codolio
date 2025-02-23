class Solution {
        public int reverse(int x) {
            long reversed = 0;
            while (x != 0) {
                int digit = x % 10;  // Extract last digit
                reversed = reversed * 10 + digit; // Build reversed number
                x /= 10; // Remove last digit
                // Check for integer overflow
                if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                    return 0;
                    }
                    }
                    return (int) reversed;
                    }
                    }

