package leetcode.find_numbers_with_even_number_of_digits;

public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            String numStr = String.valueOf(nums[i]);

            if (numStr.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
