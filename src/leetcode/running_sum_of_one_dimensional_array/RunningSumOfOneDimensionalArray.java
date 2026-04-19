package leetcode.running_sum_of_one_dimensional_array;

public class RunningSumOfOneDimensionalArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            result[i] = sum + nums[i];
            sum += nums[i];
        }

        for (int res : result) {
            System.out.println(res);
        }

        return result;
    }
}
