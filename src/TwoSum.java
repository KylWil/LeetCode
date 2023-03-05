import java.util.Arrays;

public class TwoSum {
}

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int q = 0; q < nums.length; q++) {
                if (nums[i] + nums[q] == target && q != i) {
                    solution[0] = i;
                    solution[1] = q;
                    return solution;
                }
            }
        }
        return null;
    }
}
