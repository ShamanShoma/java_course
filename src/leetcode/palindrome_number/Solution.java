package leetcode.palindrome_number;

public class Solution {

    public boolean isPalindrome(int x) {

        int reverseX = 0;
        int newX = x;

        while (newX != 0) {
            int digit = newX % 10;
            reverseX = reverseX * 10 + digit;
            newX /= 10;
        }

        if (x == reverseX && x > 0) {
            return true;
        } else return false;

    }
}
