class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (but not 0 itself) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Reverse only half of the number
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x = x / 10;
        }

        // For even digit numbers: x == reversedHalf
        // For odd digit numbers: x == reversedHalf / 10 (middle digit doesn't matter)
        return (x == reversedHalf) || (x == reversedHalf / 10);
    }
}